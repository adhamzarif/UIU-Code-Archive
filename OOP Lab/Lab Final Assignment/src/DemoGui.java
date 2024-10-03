import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

class Product {
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    int getTotalPrice() {
        return product.price * quantity;
    }
}

public class DemoGui extends JFrame {
    private JList<String> list1;
    private JList<String> cartList;
    private JButton addToCartButton;
    private JLabel productLabel;
    private JPanel mainPanel;
    private JTextField quantityField;
    private JButton incrementButton;
    private JButton decrementButton;
    private JButton checkoutButton;
    private JButton deleteButton;
    private JLabel totalAmountLabel;

    ArrayList<Product> products = new ArrayList<>();
    DefaultListModel<String> productListModel = new DefaultListModel<>();
    DefaultListModel<String> cartListModel = new DefaultListModel<>();
    ArrayList<CartItem> cart = new ArrayList<>();
    int selectedProductIndex = -1;

    public DemoGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        quantityField.setText("0");
        products.add(new Product("Rice", 123, 100));
        products.add(new Product("Sugar", 456, 150));
        products.add(new Product("Salt", 789, 200));

        for (Product p : products) {
            productListModel.addElement("Name: " + p.name + " | Price: " + p.price + " | Stock: " + p.stock);
        }
        list1.setModel(productListModel);
        list1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    selectedProductIndex = list1.getSelectedIndex();
                    if (selectedProductIndex != -1) {
                        Product selectedProduct = products.get(selectedProductIndex);
                        productLabel.setText("Selected Product: " + selectedProduct.name);
                    }
                }
            }
        });
        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int currentQuantity = Integer.parseInt(quantityField.getText());
                    if (currentQuantity > 0) {
                        quantityField.setText(String.valueOf(--currentQuantity));
                    }
                } catch (NumberFormatException ex) {
                    quantityField.setText("0");
                }
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int currentQuantity = Integer.parseInt(quantityField.getText());
                    quantityField.setText(String.valueOf(++currentQuantity));
                } catch (NumberFormatException ex) {
                    quantityField.setText("1");
                }
            }
        });
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedProductIndex != -1) {
                    Product selectedProduct = products.get(selectedProductIndex);
                    int selectedQuantity = 0;
                    try {
                        selectedQuantity = Integer.parseInt(quantityField.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(DemoGui.this, "Please enter a valid quantity.");
                        return;
                    }
                    if (selectedQuantity > selectedProduct.stock) {
                        JOptionPane.showMessageDialog(DemoGui.this, "Not enough stock available!");
                    } else {
                        boolean productInCart = false;
                        for (CartItem item : cart) {
                            if (item.product.name.equals(selectedProduct.name)) {
                                item.quantity += selectedQuantity;
                                productInCart = true;
                                break;
                            }
                        }
                        if (!productInCart) {
                            CartItem newItem = new CartItem(selectedProduct, selectedQuantity);
                            cart.add(newItem);
                        }
                        updateCartList();
                        selectedProduct.stock -= selectedQuantity;
                        productListModel.set(selectedProductIndex, "Name: " + selectedProduct.name + " | Price: " + selectedProduct.price + " | Stock: " + selectedProduct.stock);
                    }
                } else {
                    JOptionPane.showMessageDialog(DemoGui.this, "Please select a product.");
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedProductIndex = list1.getSelectedIndex();
                if (selectedProductIndex != -1) {
                    Product selectedProduct = products.get(selectedProductIndex);
                    products.remove(selectedProductIndex);
                    productListModel.remove(selectedProductIndex);
                    for (int i = cart.size() - 1; i >= 0; i--) {
                        if (cart.get(i).product.equals(selectedProduct)) {
                            cart.remove(i);
                        }
                    }
                    updateCartList();
                } else {
                    JOptionPane.showMessageDialog(DemoGui.this, "Please select a product to delete.");
                }
            }
        });
        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String summary = "";
                int totalAmount = 0;
                int totalItems = 0;

                for (CartItem item : cart) {
                    int productTotal = item.getTotalPrice();
                    summary = summary + "Product: " + item.product.name + " | Qty: " + item.quantity + " | Total: " + productTotal + "\n";
                    totalAmount += productTotal;
                    totalItems += item.quantity;
                }

                totalAmountLabel.setText("Total Items: " + totalItems + " | Total Amount: " + totalAmount);
            }
        });
        setVisible(true);
    }
    private void updateCartList() {
        cartListModel.clear();
        for (CartItem item : cart) {
            cartListModel.addElement("Product: " + item.product.name + " | Quantity: " + item.quantity + " | Price: " + (item.product.price * item.quantity));
        }
        cartList.setModel(cartListModel);
    }
    public static void main(String[] args) {
        new DemoGui();
    }
}
