import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    // Adding Additional Functions
    JLabel jLabel = new JLabel("Count");
    JButton jButton = new JButton("Click");
    JButton jButton1 = new JButton("Reset");
    JTextField jTextField = new JTextField("0");

    public Gui() {
        // Setup frame
        setVisible(true);
        setSize(500, 300); // Set frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program when window is closed
        setLocationRelativeTo(null); // Center the window

        // Layout setup
        setLayout(null);
        jLabel.setBounds(10, 5, 50, 50);
        jButton.setBounds(30, 50, 70, 20);
        jButton1.setBounds(200, 10, 90, 30);
        jTextField.setBounds(50, 10, 80, 30);

        // Add components to frame
        add(jLabel);
        add(jButton);
        add(jButton1);
        add(jTextField);

        // Action listener for the "Click" button
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the current text from the text field
                    String value = jTextField.getText();
                    // Parse the text to an integer
                    int i = Integer.parseInt(value);
                    // Increment the integer value
                    i++;
                    // Set the updated integer value back to the text field
                    jTextField.setText(Integer.toString(i));
                } catch (NumberFormatException ex) {
                    // Handle the case where the text field does not contain a valid number
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });

        // Action listener for the "Reset" button
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset the text field to "0"
                jTextField.setText("0");
            }
        });
    }
}