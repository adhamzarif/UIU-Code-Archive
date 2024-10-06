package PACKAGE_NAME;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2_CelsiusToFahrenheitConverter {

    private JFrame frame;
    private JTextField textFieldCelsius;
    private JTextField textFieldFahrenheit;
    private JButton btnConvert;

    public Q2_CelsiusToFahrenheitConverter() {
        initialize();
    }

    private void initialize() {
        // Create the frame
        frame = new JFrame("CtoF Converter - OOP Final");
        frame.setBounds(100, 100, 300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Create the Celsius input field and label
        JLabel lblCelsius = new JLabel("Enter celsius value:");
        lblCelsius.setBounds(10, 10, 150, 25);
        frame.getContentPane().add(lblCelsius);

        textFieldCelsius = new JTextField();
        textFieldCelsius.setBounds(160, 10, 50, 25);
        frame.getContentPane().add(textFieldCelsius);
        textFieldCelsius.setColumns(10);

        JLabel lblC = new JLabel("C");
        lblC.setBounds(220, 10, 50, 25);
        frame.getContentPane().add(lblC);

        // Create the Fahrenheit output field and label
        JLabel lblFahrenheit = new JLabel("Fahrenheit value:");
        lblFahrenheit.setBounds(10, 70, 150, 25);
        frame.getContentPane().add(lblFahrenheit);

        textFieldFahrenheit = new JTextField();
        textFieldFahrenheit.setBounds(160, 70, 50, 25);
        textFieldFahrenheit.setEditable(false);  // Make this field non-editable
        frame.getContentPane().add(textFieldFahrenheit);
        textFieldFahrenheit.setColumns(10);

        JLabel lblF = new JLabel("F");
        lblF.setBounds(220, 70, 50, 25);
        frame.getContentPane().add(lblF);

        // Create the Convert button
        btnConvert = new JButton("Convert to Fahrenheit");
        btnConvert.setBounds(50, 40, 180, 25);
        frame.getContentPane().add(btnConvert);

        // Add action listener to the Convert button
        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the Celsius value from textFieldCelsius
                    String celsiusText = textFieldCelsius.getText();

                    // Convert the text to a double
                    double celsius = Double.parseDouble(celsiusText);

                    // Convert Celsius to Fahrenheit using the formula F = (C * (9/5)) + 32
                    double fahrenheit = (celsius * 9/5) + 32;

                    // Display the Fahrenheit value in textFieldFahrenheit
                    textFieldFahrenheit.setText(String.format("%.1f", fahrenheit));

                } catch (NumberFormatException ex) {
                    // Handle case when the input is not a valid number
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for Celsius", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        try {
            // Directly instantiate and show the window
            Q2_CelsiusToFahrenheitConverter window = new Q2_CelsiusToFahrenheitConverter();
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

