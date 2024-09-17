package Problem1;

class FullTimeEmployee extends Employee implements HealthInsuranceEligible {
    private double annualSalary;

    public FullTimeEmployee(String name, int employeeID, double annualSalary) {
        super(name, employeeID);
        this.annualSalary = annualSalary;
    }

    // Calculate monthly salary (annual salary / 12)
    @Override
    public double calculateSalary() {
        return annualSalary / 12;
    }

    // Enroll in health insurance
    @Override
    public void enrollInHealthInsurance() {
        System.out.println(name + " has been enrolled in health insurance.");
    }

    // Cancel health insurance
    @Override
    public void cancelHealthInsurance() {
        System.out.println(name + " has canceled health insurance.");
    }
}