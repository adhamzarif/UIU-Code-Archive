import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    //Adding Additional Functions
    JLabel jLabel = new JLabel("Count");
    JButton jButton = new JButton("Click");
    JButton jButton1 = new JButton("Reset");
    JTextField jTextField = new JTextField("0");
    JTextField jTextField1 = new JTextField("0");

    Gui() {
        setVisible(true);
        setSize(500, 300); // declaring frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the program will get close when we click the exit button
        setLocationRelativeTo(null); // to see the frame in the front

        //Adding Additional Functions
        setLayout(null);
        jLabel.setBounds(10,5,50,50);
        jButton.setBounds(30,50,70,20);
        jButton1.setBounds(200,10,90,30);
        jTextField.setBounds(50,10,80, 30);

        add(jLabel);
        add(jButton);
        add(jButton1);
        add(jTextField);
        add(jTextField1);

        // Action listener for the "Click" button
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
                String value = jTextField.getText();
//                System.out.println(value);
                int i = Integer.parseInt(value);
                i++;
                jTextField.setText(i+"");

            }
        });
        // Action listener for the "Reset" button
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("0");
                jTextField1.setText("0");
            }
        });
    }
}
