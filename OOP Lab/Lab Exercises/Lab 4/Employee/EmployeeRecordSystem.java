package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordSystem {
    private List<Employee> employees;
    private Scanner scanner;

    public EmployeeRecordSystem() {
        this.employees = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("Employee Record System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Calculate Salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    calculateSalary();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    public void addEmployee() {
        System.out.print("Enter employee type (Salaried, Hourly, Commission, BasePlusCommission): ");
        String type = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        Employee employee = new Employee(name, id, type);

        switch (type) {
            case "Salaried":
                System.out.print("Enter annual salary: ");
                double annualSalary = scanner.nextDouble();
                employee.setAnnualSalary(annualSalary);
                break;
            case "Hourly":
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                double hoursWorked = scanner.nextDouble();
                employee.setHourlyRate(hourlyRate);
                employee.setHoursWorked(hoursWorked);
                break;
            case "Commission":
                System.out.print("Enter sales: ");
                double sales = scanner.nextDouble();
                System.out.print("Enter commission rate: ");
                double commissionRate = scanner.nextDouble();
                employee.setSales(sales);
                employee.setCommissionRate(commissionRate);
                break;
            case "BasePlusCommission":
                System.out.print("Enter sales: ");
                sales = scanner.nextDouble();
                System.out.print("Enter commission rate: ");
                commissionRate = scanner.nextDouble();
                System.out.print("Enter base salary: ");
                double baseSalary = scanner.nextDouble();
                employee.setSales(sales);
                employee.setCommissionRate(commissionRate);
                employee.setBaseSalary(baseSalary);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }

        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployee() {
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void updateEmployee() {
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.print("Enter new name: ");
                employee.setName(scanner.nextLine());
                System.out.println("Employee info updated.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void calculateSalary() {
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println("Salary: " + employee.calculateSalary());
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}
