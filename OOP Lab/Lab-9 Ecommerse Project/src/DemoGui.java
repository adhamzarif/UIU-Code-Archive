import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Product {
    String name;
    int price;
//    private String grade;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }}

public class DemoGui extends JFrame{
    private JList list1;
    private JButton button1;
    private JLabel label1;
    private JPanel jP;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField a0TextField;
    private JButton addButton;
    private JTextField textField3;
    private JLabel label4;
    private JButton doneButton1;
    int inx=-1;
    public DemoGui() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setLayout(null);

        setContentPane(jP);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Rice", 123));
        products.add(new Product("Sugar", 456));
        products.add(new Product("Salt", 789));

        DefaultListModel<String> l1 = new DefaultListModel<>();

        for (Product s : products) {
            String price = String.valueOf(s.price);
            l1.addElement("Name: "+ s.name+" "+"Price: "+price);
        }
        list1.setModel(l1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list1.getSelectedIndex() != -1){
                    inx = list1.getSelectedIndex();
                    System.out.println(list1.getSelectedIndex());
                    textField1.setText(list1.getSelectedValue().toString());
                }else
                    JOptionPane.showMessageDialog(DemoGui.this,"Please select a valid Product");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productQuantity = Integer.parseInt(a0TextField.getText());
                productQuantity+=1;
                a0TextField.setText(String.valueOf(productQuantity));
            }
        });

        doneButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(a0TextField.getText()) != 0) {
                    if(inx != -1){
                        String pName = products.get(inx).name;
                        int pPrice = products.get(inx).price;
                        int tCount = Integer.parseInt(a0TextField.getText());
                        int tPrice = pPrice * tCount;
                        textField3.setText("Name: "+pName+"Total Price: "+tPrice);
                    }else{
                        textField3.setText("No Product Added");
                    }
                }
                else
                    textField3.setText("No Product Added!!!");
            }
        });
    }

    public static void main(String[] args) {
        new DemoGui();
    }
}

