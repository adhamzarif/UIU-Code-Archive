import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ECommerceGUI extends JFrame {
    private JList<String> productList;
    private JButton addButton, removeButton, doneButton;
    private JLabel label1, label2, label3, totalLabel;
    private JTextField quantityField, totalPriceField;
    private JPanel panel;
    private DefaultListModel<String> cartModel;
    private ArrayList<Product> cart;
    private int selectedIndex = -1;

    public ECommerceGUI() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        setContentPane(panel);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Rice", 123, 10));
        products.add(new Product("Sugar", 456, 15));
        products.add(new Product("Salt", 789, 8));

        DefaultListModel<String> productListModel = new DefaultListModel<>();
        for (Product p : products) {
            productListModel.addElement("Name: " + p.name + " | Price: " + p.price + " | Stock: " + p.quantity);
        }
        productList.setModel(productListModel);

        cartModel = new DefaultListModel<>();
        cart = new ArrayList<>();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (productList.getSelectedIndex() != -1) {
                    selectedIndex = productList.getSelectedIndex();
                    Product selectedProduct = products.get(selectedIndex);

                    int quantity = Integer.parseInt(quantityField.getText());
                    if (quantity > selectedProduct.quantity) {
                        JOptionPane.showMessageDialog(ECommerceGUI.this, "Not enough stock available!");
                        return;
                    }

                    cart.add(new Product(selectedProduct.name, selectedProduct.price, quantity));
                    selectedProduct.quantity -= quantity;
                    cartModel.addElement("Name: " + selectedProduct.name + " | Qty: " + quantity);
                } else {
                    JOptionPane.showMessageDialog(ECommerceGUI.this, "Please select a product!");
                }
            }
        });

        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalAmount = 0;
                for (Product p : cart) {
                    totalAmount += p.price * p.quantity;
                }
                totalPriceField.setText("Total Payable Amount: $" + totalAmount);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cartModel.getSize() > 0) {
                    int indexToRemove = productList.getSelectedIndex();
                    if (indexToRemove != -1) {
                        cartModel.removeElementAt(indexToRemove);
                        cart.remove(indexToRemove);
                    } else {
                        JOptionPane.showMessageDialog(ECommerceGUI.this, "Select an item to remove!");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new ECommerceGUI();
    }
}
