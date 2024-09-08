import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleCheckBoxGui extends JFrame {
    private JCheckBox checkBox = new JCheckBox("Check me");
    private JButton toggleButton = new JButton("Check");

    public ToggleCheckBoxGui() {
        // Setup frame
        setVisible(true);
        setSize(300, 150); // Set frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program when window is closed
        setLocationRelativeTo(null); // Center the window

        // Layout setup
        setLayout(null);
        checkBox.setBounds(50, 30, 150, 30);
        toggleButton.setBounds(50, 70, 100, 30);

        // Add components to frame
        add(checkBox);
        add(toggleButton);

        // Action listener for the toggle button
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    // If checkbox is checked, uncheck it and change button text to "Check"
                    checkBox.setSelected(false);
                    toggleButton.setText("Check");
                } else {
                    // If checkbox is not checked, check it and change button text to "UnCheck"
                    checkBox.setSelected(true);
                    toggleButton.setText("UnCheck");
                }
            }
        });
    }
}