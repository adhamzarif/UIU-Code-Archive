public class SuperStarEmployee extends Employee {

    public SuperStarEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        float salary = getSalary();
        float bonus = salary * 0.10f;
        float totalSalary = salary + bonus;
        System.out.println("SuperStarEmployee Name: " + getName());
        System.out.println("Bonus Amount: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
