package Lab4;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        switch (type) {
            case "Salaried":
                return annualSalary / 12;  // Monthly salary for a salaried employee
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
}
