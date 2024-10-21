package Question3.a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicButtonGUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private int buttonCount = 0;

    public DynamicButtonGUI() {
        frame = new JFrame();
        panel = new JPanel();
        addButton = new JButton("ADD");



        frame.setTitle("Dynamic Button GUI");
//        frame.setLocation(500,200);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.add(addButton);
        frame.add(panel);

        addButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonCount++;
        JButton newButton = new JButton("b" + buttonCount);
//        JLabel blabel = new JLabel("b" + buttonCount);

//        panel.add(blabel);
        panel.add(newButton);
        panel.revalidate();

    }

    public static void main(String[] args) {
        DynamicButtonGUI d = new DynamicButtonGUI();
    }
}

