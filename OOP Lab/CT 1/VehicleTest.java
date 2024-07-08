package Code;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled and fuel consumption of car: ");
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();

        Car car = new Car(val1, val2);

        System.out.println("Please enter a choice: \n1. Mileage of Car\n2. Cost of Fuel\n3. Maximum Cost");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Mileage is: " + car.calculateMileage());
                break;

            case 2:
                System.out.println("Cost of Fuel is: " + car.calculateCost());
                break;

            case 3:
                System.out.println("Enter 4 integer numbers to calculate maximum cost: ");
                int input1 = sc.nextInt();
                int input2 = sc.nextInt();
                int input3 = sc.nextInt();
                int input4 = sc.nextInt();

                int maximum = input1;
                if (maximum < input2) maximum = input2;
                if (maximum < input3) maximum = input3;
                if (maximum < input4) maximum = input4;

                System.out.println("Maximum Cost is: " + maximum);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}


//package Code;
//
//import java.util.Scanner;
//
//public class VehicleTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter distance travelled and fuel consumption of car: ");
//        double val1 = sc.nextDouble();
//        double val2 = sc.nextDouble();
//
//        Car car = new Car(val1, val2);
//
//        System.out.println("Please enter a choice: \n1. Mileage of Car\n2. Cost of Fuel\n3. Maximum Cost");
//        int input = sc.nextInt();
//
//        if (input == 1) {
//            System.out.println("Mileage is: " + car.calculateMileage());
//        } else if (input == 2) {
//            System.out.print("Enter fuel price per liter: ");
//            double pricePerLiter = sc.nextDouble();
//            System.out.println("Cost of Fuel is: " + car.calculateCost(pricePerLiter));
//        } else if (input == 3) {
//            System.out.println("Enter 4 integer numbers to calculate maximum cost: ");
//            int input1 = sc.nextInt();
//            int input2 = sc.nextInt();
//            int input3 = sc.nextInt();
//            int input4 = sc.nextInt();
//
//            int maximum = input1;
//            if (maximum < input2) maximum = input2;
//            if (maximum < input3) maximum = input3;
//            if (maximum < input4) maximum = input4;
//
//            System.out.println("Maximum Cost is: " + maximum);
//        } else {
//            System.out.println("Invalid choice.");
//        }
//
//        sc.close();
//    }
//}



