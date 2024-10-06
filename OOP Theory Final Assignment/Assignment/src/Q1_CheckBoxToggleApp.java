import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxToggleApp {
    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("CheckBox Toggle Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");
        checkBox.setBounds(50, 30, 100, 30);

        // Create a JButton
        JButton button = new JButton("Check");
        button.setBounds(150, 30, 100, 30);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if the checkbox is selected
                if (checkBox.isSelected()) {
                    // Uncheck the checkbox and change the button text to "Check"
                    checkBox.setSelected(false);
                    button.setText("Check");
                } else {
                    // Check the checkbox and change the button text to "UnCheck"
                    checkBox.setSelected(true);
                    button.setText("UnCheck");
                }
            }
        });

        // Add the checkbox and button to the frame
        frame.add(checkBox);
        frame.add(button);

        // Set frame visibility to true
        frame.setVisible(true);
    }
}
