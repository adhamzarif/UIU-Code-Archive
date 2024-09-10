public class Main {
    public static void main(String[] args) {
        Employee superStar = new SuperStarEmployee("Adham", 5000.00f);
        Employee star = new StarEmployee("Zarif", 4000.00f);

        superStar.printSalary();
        star.printSalary();
    }
}