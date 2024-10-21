package Question4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JLabel output;
    JTextField input;
    JButton perform;

    public Calculator() {
        JFrame frame = new JFrame();
        output = new JLabel("10");
        input = new JTextField(10);
        perform = new JButton("Perform");

        frame.setBounds(500, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        output.setBounds(100, 50, 100, 50);
        input.setBounds(100, 150, 100, 50);
        perform.setBounds(100, 250, 100, 50);


        frame.add(output);
        frame.add(input);
        frame.add(perform);

        perform.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        String[] parts = input.getText().split(" ");
        String operator = parts[0];
        int number = Integer.parseInt(parts[1]);

        int currentOutput = Integer.parseInt(output.getText());
        int result = 0;

        switch (operator) {
            case "+":
                result = currentOutput + number;
                break;
            case "-":
                result = currentOutput - number;
                break;
            case "*":
                result = currentOutput * number;
                break;
            case "/":
                result = currentOutput / number;
                break;
        }

        output.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

