package Problem1;

class Freelancer extends Employee { //Concrete class
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(String name, int employeeID, double hourlyRate, int hoursWorked) {
        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate salary based on hourly rate and hours worked
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}