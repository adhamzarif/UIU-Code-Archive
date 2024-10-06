import java.io.*;
import java.util.*;

public class Q6_EmployeeIncrement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of employees: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        // Create an ArrayList to hold employee data
        List<Employee> employees = new ArrayList<>();

        // Collect employee data (name, id, performance scores)
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            String id = scanner.nextLine();

            System.out.println("Enter the last 6 months' performance scores (separated by spaces):");
            double[] scores = new double[6];
            for (int j = 0; j < 6; j++) {
                scores[j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume the newline after scores input

            // Calculate the average score
            double averageScore = calculateAverage(scores);

            // Create an Employee object and add to the list
            employees.add(new Employee(name, id, averageScore));
        }

        // Write employee details to "employee.txt"
        writeEmployeeDetailsToFile(employees);

        // Read employee details from "employee.txt" and find employees eligible for increment
        findEmployeesEligibleForIncrement();
    }

    // Method to calculate the average score
    public static double calculateAverage(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }

    // Method to write employee details to "employee.txt"
    public static void writeEmployeeDetailsToFile(List<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"))) {
            for (Employee employee : employees) {
                writer.write(employee.getName());
                writer.newLine();
                writer.write(employee.getId());
                writer.newLine();
                writer.write(String.valueOf(employee.getAverageScore()));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read "employee.txt" and find employees eligible for an increment
    public static void findEmployeesEligibleForIncrement() {
        try (BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
             BufferedWriter incrementWriter = new BufferedWriter(new FileWriter("increment.txt"))) {

            String name;
            while ((name = reader.readLine()) != null) {
                String id = reader.readLine();
                double averageScore = Double.parseDouble(reader.readLine());

                // If the average score is more than 75, write the employee's name to "increment.txt"
                if (averageScore > 75) {
                    incrementWriter.write(name);
                    incrementWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing to the file.");
            e.printStackTrace();
        }
    }
}

// Employee class to hold employee data
class Employee {
    private String name;
    private String id;
    private double averageScore;

    public Employee(String name, String id, double averageScore) {
        this.name = name;
        this.id = id;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
