package Problem1;

abstract class Employee {
    protected String name;
    protected int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Common method to display employee details
    public void displayDetails() {
        System.out.println("Problem1.Employee ID: " + employeeID + ", Name: " + name);
    }

    // Abstract method to be implemented by specific employee types for calculating salary
    public abstract double calculateSalary();

    // Method to calculate provident fund (5% of salary)
    public double calculateProvidentFund() {
        return calculateSalary() * 0.05;
    }
}