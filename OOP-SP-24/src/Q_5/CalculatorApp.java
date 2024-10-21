package Q_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorApp extends JFrame implements ActionListener {
    JTextField Input;
    JLabel Output;
    JButton Perform;
    int outputValue;

    public CalculatorApp() {
        super("Simple Calculator");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputValue = 10; // Initial output value
        Output = new JLabel(String.valueOf(outputValue));
        Input = new JTextField(10);
        Perform = new JButton("Perform");

        add(new JLabel("Input (operator number):"));
        add(Input);
        add(Perform);
        add(new JLabel("Output:"));
        add(Output);

        Perform.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Perform) {
            char operator = ' ';
            int inputNumber = 0;
            int i = 0;
            String inputText = Input.getText();

            // Find the operator and the number
            while (i < inputText.length()) {
                char ch = inputText.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    operator = ch;
                    i++;
                    break;
                }
                i++;
            }

            // Parse the number
            while (i < inputText.length() && Character.isWhitespace(inputText.charAt(i))) {
                i++; // Skip whitespace
            }

            while (i < inputText.length() && Character.isDigit(inputText.charAt(i))) {
                inputNumber = inputNumber * 10 + (inputText.charAt(i) - '0');
                i++;
            }

            // Check if operator was found
            if (operator == ' ') {
                System.out.println("Please enter a valid operator followed by a number.");
                return;
            }

            // Perform the operation
            switch (operator) {
                case '+':
                    outputValue += inputNumber;
                    break;
                case '-':
                    outputValue -= inputNumber;
                    break;
                case '*':
                    outputValue *= inputNumber;
                    break;
                case '/':
                    if (inputNumber != 0) {
                        outputValue /= inputNumber;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, * or /.");
                    return;
            }

            // Update the output label
            Output.setText(String.valueOf(outputValue));
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}

