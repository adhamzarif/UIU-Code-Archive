package Question3.b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberOperationsGUI implements ActionListener {
    private JTextField n1, n2, n3, result;
    private JButton max, min, avg, clr;

    public NumberOperationsGUI() {
        JFrame frame = new JFrame("Number Operations");

        n1 = new JTextField(5);
        n2 = new JTextField(5);
        n3 = new JTextField(5);
        result = new JTextField(10);

        max = new JButton("Max");
        min = new JButton("Min");
        avg = new JButton("Avg");
        clr = new JButton("Clr");

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("N1:"));
        frame.add(n1);
        frame.add(new JLabel("N2:"));
        frame.add(n2);
        frame.add(new JLabel("N3:"));
        frame.add(n3);
        frame.add(new JLabel("Result:"));
        frame.add(result);
        frame.add(max);
        frame.add(min);
        frame.add(avg);
        frame.add(clr);

        max.addActionListener(this);
        min.addActionListener(this);
        avg.addActionListener(this);
        clr.addActionListener(this);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());
        int num3 = Integer.parseInt(n3.getText());

        if (e.getSource() == max) {
            int maximum = Math.max(num1, Math.max(num2, num3));
            result.setText(maximum + "");
        } else if (e.getSource() == min) {
            int minimum = Math.min(num1, Math.min(num2, num3));
            result.setText(minimum + "");
        } else if (e.getSource() == avg) {
            int average = (num1 + num2 + num3) / 3;
            result.setText(average + "");
        } else if (e.getSource() == clr) {
            n1.setText("");
            n2.setText("");
            n3.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        NumberOperationsGUI n = new NumberOperationsGUI();
    }
}

