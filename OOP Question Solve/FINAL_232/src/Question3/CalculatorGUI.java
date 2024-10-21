package Question3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorGUI implements ActionListener{
    private JTextField n1Field, n2Field, resultField;
    private JLabel n1,n2,result;
    private JButton addButton, subtractButton;
    private JFrame frame;
    private JPanel panel;

    public CalculatorGUI() {
        // Initialize the GUI components (Assume JFrame and layout setup code is present)
        frame = new JFrame("Calculator");


        panel = new JPanel();
        n1 = new JLabel("N1:");
        n2 = new JLabel("N2:");
        result = new JLabel("Result:");
        n1Field = new JTextField(10);
        n2Field = new JTextField(10);
        resultField = new JTextField(20);
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");

        // Add components to the panel
        panel.add(n1);
        panel.add(n1Field);
        panel.add(n2);
        panel.add(n2Field);
        panel.add(result);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);

        // Add panel to the frame
        frame.add(panel);

        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        addButton.addActionListener(this);

        subtractButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        if (e.getSource() == addButton) {
            int n1 = Integer.parseInt(n1Field.getText());
            int n2 = Integer.parseInt(n2Field.getText());
            int result = n1 + n2;
            resultField.setText(String.valueOf(result));
        } else if (e.getSource() == subtractButton) {
            int n1 = Integer.parseInt(n1Field.getText());
            int n2 = Integer.parseInt(n2Field.getText());
            int result = n1 - n2;
            resultField.setText(String.valueOf(result));
        }
    }
}

