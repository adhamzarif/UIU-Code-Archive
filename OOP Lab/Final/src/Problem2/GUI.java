package Problem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    String name;
    String id;
    double CGPA;
    int totalCreditCompleted;

    Student(String name, String id, double CGPA, int totalCreditCompleted) {
        this.CGPA = CGPA;
        this.id = id;
        this.name = name;
        this.totalCreditCompleted = totalCreditCompleted;
    }

    // Method to calculate CGPA based on the GPA of 5 courses
    public static double calculateCGPA(double C1, double C2, double C3, double C4, double C5, double currentCGPA, int totalCredits) {
        double newGPA = (C1 + C2 + C3 + C4 + C5) / 5;
        int currentSemesterCredits = 20; // Assuming 20 credits for the current semester
        return ((currentCGPA * totalCredits) + (newGPA * currentSemesterCredits)) / (totalCredits + currentSemesterCredits);
    }
}

public class GUI implements ActionListener {
    JTextField[] courseFields = new JTextField[5];  // For 5 courses
    JLabel cgpaLabel;
    Student student;

    GUI(Student student) {
        this.student = student;
        JFrame f = new JFrame("CGPA Calculator");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);

        // Adding input fields for 5 courses
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Enter GPA for Course " + (i + 1) + ": ");
            f.add(label);
            courseFields[i] = new JTextField(10);
            f.add(courseFields[i]);
        }

        // Button to calculate CGPA
        JButton calculateButton = new JButton("Calculate CGPA");
        calculateButton.addActionListener(this);
        f.add(calculateButton);

        // Label to display CGPA
        cgpaLabel = new JLabel("CGPA will be displayed here.");
        f.add(cgpaLabel);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse GPA inputs
            double[] gpaScores = new double[5];
            for (int i = 0; i < 5; i++) {
                gpaScores[i] = Double.parseDouble(courseFields[i].getText());
                if (gpaScores[i] < 0 || gpaScores[i] > 4) {
                    throw new Exception("GPA must be between 0 and 4.");
                }
            }

            // Calculate CGPA
            double newCGPA = Student.calculateCGPA(gpaScores[0], gpaScores[1], gpaScores[2], gpaScores[3], gpaScores[4], student.CGPA, student.totalCreditCompleted);
            student.CGPA = newCGPA;  // Update student CGPA
            student.totalCreditCompleted += 20;  // Update credit count

            cgpaLabel.setText("Updated CGPA: " + newCGPA);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid GPA input! Enter numeric values.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example student with initial CGPA and completed credits
        Student student = new Student("John Doe", "12345", 3.5, 60);
        new GUI(student);
    }
}
