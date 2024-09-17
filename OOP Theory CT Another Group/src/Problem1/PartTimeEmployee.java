package Problem1;

class PartTimeEmployee extends Employee { // Concrete class
    private double annualSalary;
    private int contractDurationMonths; // Contract duration in months

    public PartTimeEmployee(String name, int employeeID, double annualSalary, int contractDurationMonths) {
        super(name, employeeID);
        this.annualSalary = annualSalary;
        this.contractDurationMonths = contractDurationMonths;
    }

    // Calculate salary based on contract duration (e.g., 6 months = 50% of annual salary)
    @Override
    public double calculateSalary() {
        return (contractDurationMonths / 12.0) * annualSalary;
    }
}