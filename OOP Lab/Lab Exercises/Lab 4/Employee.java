Create an Employee record system for a company. The application will help the company to
view record of a specific employee, update his info. The Company has 4 types of employee
(Salaried, Hourly, Commission, and Base plus commission), your application must handle all
types of employee.


public class Employee {
    private String name;
    private String id;
    private String type;  // "Salaried", "Hourly", "Commission", "BasePlusCommission"
    
    private double annualSalary;  // for Salaried
    private double hourlyRate;    // for Hourly
    private double hoursWorked;   // for Hourly
    private double sales;         // for Commission and BasePlusCommission
    private double commissionRate;// for Commission and BasePlusCommission
    private double baseSalary;    // for BasePlusCommission
    
    public Employee(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }
    
    // Getters and setters for all fields
    // ...

    public double calculateSalary() {
        switch (type) {
            case "Salaried":
                return annualSalary / 12;
            case "Hourly":
                return hourlyRate * hoursWorked;
            case "Commission":
                return sales * commissionRate;
            case "BasePlusCommission":
                return sales * commissionRate + baseSalary;
            default:
                return 0.0;
        }
    }
    
    @Override
    public String toString() {
        String info = "Name: " + name + ", ID: " + id + ", Type: " + type;
        switch (type) {
            case "Salaried":
                info += ", Annual Salary: " + annualSalary;
                break;
            case "Hourly":
                info += ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
                break;
            case "Commission":
                info += ", Sales: " + sales + ", Commission Rate: " + commissionRate;
                break;
            case "BasePlusCommission":
                info += ", Sales: " + sales + ", Commission Rate: " + commissionRate + ", Base Salary: " + baseSalary;
                break;
        }
        return info;
    }
    
    // Add getters and setters for all the fields
}








import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordSystem {
    private static List<Employee> employees = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    addEmployee(scanner);
                    break;
                case 2:
                    viewEmployee(scanner);
                    break;
                case 3:
                    updateEmployee(scanner);
                    break;
                case 4:
                    calculateSalary(scanner);
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
    
    private static void addEmployee(Scanner scanner) {
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
    
    private static void viewEmployee(Scanner scanner) {
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
    
    private static void updateEmployee(Scanner scanner) {
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
    
    private static void calculateSalary(Scanner scanner) {
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
