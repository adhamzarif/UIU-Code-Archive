public class StarEmployee extends Employee {

    public StarEmployee(String name, float salary) {
        super(name, salary);
    }
    @Override
    public void printSalary() {
        float salary = getSalary();
        float bonus = salary * 0.05f;
        float totalSalary = salary + bonus;
        System.out.println("StarEmployee Name: " + getName());
        System.out.println("Bonus Amount: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
