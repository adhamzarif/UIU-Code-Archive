import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4_ButtonColorToggle {

    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Button Color Toggle");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute layout

        // Create Button 1 with red background
        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(50, 50, 100, 30); // Set position and size
        btn1.setBackground(Color.RED); // Set initial background color to red
        frame.add(btn1);

        // Create Button 2 with blue background
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(160, 50, 100, 30); // Set position and size
        btn2.setBackground(Color.BLUE); // Set initial background color to blue
        frame.add(btn2);

        // Add ActionListener to Button 1
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Toggle Button 1 between Red and Green
                if (btn1.getBackground() == Color.RED) {
                    btn1.setBackground(Color.GREEN);
                } else {
                    btn1.setBackground(Color.RED);
                }
            }
        });

        // Add ActionListener to Button 2
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Toggle Button 2 between Blue and Cyan
                if (btn2.getBackground() == Color.BLUE) {
                    btn2.setBackground(Color.CYAN);
                } else {
                    btn2.setBackground(Color.BLUE);
                }
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
