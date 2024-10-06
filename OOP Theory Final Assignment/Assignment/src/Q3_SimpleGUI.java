import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3_SimpleGUI {

    public static void main(String[] args) {
        // Create a new frame (Window)
        JFrame frame = new JFrame("Message Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute layout

        // Create a new button
        JButton btnClick = new JButton("Click");
        btnClick.setBounds(100, 80, 100, 30); // Set position and size of the button
        frame.add(btnClick); // Add the button to the frame

        // Add ActionListener to the button to handle the click event
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show message dialog when button is clicked
                JOptionPane.showMessageDialog(null, "Alice in OOP Land", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
