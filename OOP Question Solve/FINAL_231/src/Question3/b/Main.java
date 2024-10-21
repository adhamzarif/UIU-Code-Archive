package Question3.b;

import Question3.a.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Assume `employees` array is already populated as shown in 3a.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            double[] scores = new double[6];
            System.out.print("Enter 6 scores: ");
            for (int j = 0; j < 6; j++) {
                scores[j] = sc.nextDouble();
            }
            sc.nextLine(); // consume newline
            employees[i] = new Employee(name, id, scores);
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"));
            for (Employee emp : employees) {
                writer.write(emp.name + "\n");
                writer.write(emp.id + "\n");
                writer.write(emp.getAverageScore() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
