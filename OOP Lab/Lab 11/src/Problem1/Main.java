package Problem1;
import java.util.Scanner;

class Calculator {
    private final int num1, num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative Number Found in add");
        }
        return num1 + num2;
    }

    int subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative Number Found in subs");
        }
        return num1 - num2;
    }

    int multiply() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Zero Found in multiply");
        }
        return num1 * num2;
    }

    int division() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            Calculator obj1 = new Calculator(10, 20);
            System.out.println("Addition result: " + obj1.add());

            Calculator obj2 = new Calculator(10, 20);
            System.out.println("Subtraction result: " + obj2.subtract());


            Calculator obj3 = new Calculator(10, 20);
            System.out.println("Multiplication result: " + obj3.multiply());


            Calculator obj4 = new Calculator(10, 20);
            System.out.println("Division result: " + obj4.division());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Found: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input, please enter integers only.");
        }
    }
}
