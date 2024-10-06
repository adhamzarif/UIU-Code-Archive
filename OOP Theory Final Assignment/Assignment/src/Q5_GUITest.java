import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUITest {
    public static void main(String[] args) {
        // Create the frame
        JFrame f = new JFrame("Oceans App");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        // Oceans array
        String[] oceans = {"Arctic", "North Atlantic", "South Atlantic", "Indian", "North Pacific", "South Pacific", "Antarctic"};

        // Create the text fields
        JTextField tf1 = new JTextField(20); // For inputting the index
        JTextField tf2 = new JTextField(20); // For displaying the ocean name
        tf2.setEditable(false);  // tf2 is not editable

        // Create the button
        JButton btnShow = new JButton("Show");

        // Add ActionListener to the button
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input from tf1 (index)
                    int index = Integer.parseInt(tf1.getText());

                    // Check if the index is within the valid range (0 to 6)
                    if (index >= 0 && index < oceans.length) {
                        // Display the corresponding ocean name in tf2
                        tf2.setText(oceans[index]);
                    } else {
                        // Display an error message if the index is out of range
                        tf2.setText("Invalid index");
                    }
                } catch (NumberFormatException ex) {
                    // Display an error message if the input is not a valid number
                    tf2.setText("Enter a valid number");
                }
            }
        });

        // Add components to the frame
        f.add(tf1);
        f.add(tf2);
        f.add(btnShow);

        // Set the frame to be visible
        f.setVisible(true);
    }
}
