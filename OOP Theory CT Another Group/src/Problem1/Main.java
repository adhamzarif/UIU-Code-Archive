package Problem1;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Alice", 101, 60000);
        fullTime.displayDetails();
        System.out.println("Salary: $" + fullTime.calculateSalary());
        System.out.println("Provident Fund: $" + fullTime.calculateProvidentFund());
        fullTime.enrollInHealthInsurance();

        PartTimeEmployee partTime = new PartTimeEmployee("Bob", 102, 40000, 6);
        partTime.displayDetails();
        System.out.println("Salary: $" + partTime.calculateSalary());
        System.out.println("Provident Fund: $" + partTime.calculateProvidentFund());

        Freelancer freelancer = new Freelancer("Charlie", 103, 50, 120);
        freelancer.displayDetails();
        System.out.println("Salary: $" + freelancer.calculateSalary());
        System.out.println("Provident Fund: $" + freelancer.calculateProvidentFund());
    }
}
