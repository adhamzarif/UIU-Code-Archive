package Problem5;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private int salary;
    private int age;
    private String department;

    public Employee(String name, String id, int salary, int age, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Read full name, allowing for names with 1, 2, or 3 parts
            System.out.print("Enter name: ");
            String name = scanner.nextLine(); // This reads the entire name, handling one or more words

            // Read the remaining details (ID, Salary, Age, Department)
            System.out.print("Enter ID: ");
            String id = scanner.next();

            System.out.print("Enter Salary: ");
            int salary = scanner.nextInt();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Department: ");
            String department = scanner.next();

            scanner.nextLine(); // Consume the leftover newline

            // Add employee to the list
            employees.add(new Employee(name, id, salary, age, department));
        }

        // Count the number of employees with salary >= 12,000
        int count = 0;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() >= 12000) {
                count++;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }

        // Get the department and age range from the user
        System.out.print("Enter department for filter: ");
        String filterDepartment = scanner.next();
        System.out.print("Enter age range (min and max): ");
        int minAge = scanner.nextInt();
        int maxAge = scanner.nextInt();

        // Filter employees by department and age range
        int maxFilteredSalary = Integer.MIN_VALUE;
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(filterDepartment)
                    && employee.getAge() >= minAge
                    && employee.getAge() <= maxAge) {
                if (employee.getSalary() > maxFilteredSalary) {
                    maxFilteredSalary = employee.getSalary();
                }
                found = true;
            }
        }

        if (found) {
            System.out.println("Count of employees with salary >= 12000: " + count);
            System.out.println("Maximum salary among all employees: " + maxSalary);
            System.out.println("Max Salary in " + filterDepartment + " department for age between "
                    + minAge + " and " + maxAge + ": " + maxFilteredSalary);
        } else {
            System.out.println("No employees match the filter criteria.");
        }
    }
}

