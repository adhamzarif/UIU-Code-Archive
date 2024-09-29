package Problem1;

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

    int subst() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative Number Found in subs");
        }
        return num1 - num2;
    }

    int division() throws ArithmeticException {
        if (num1 < 0 || num2 == 0) {
            throw new ArithmeticException("Number 2 is 0 or negative in Div");
        }
        return num1 / num2;
    }

    int mult() throws ArithmeticException {
        if (num1 < 0 || num2 == 0) {
            throw new ArithmeticException("Negative Number or 0 Found in Mult");
        }
        return num1 * num2;  // Corrected to multiplication
    }

    String msg() throws NumberFormatException {
        if (num1 >= 1 || num2 >= 1) {
            return "Valid Number";
        }
        throw new NumberFormatException("Invalid Number Format");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Calculator c = new Calculator(10, 10);
            System.out.println("Add: " + c.add());
        } catch (ArithmeticException a) {
            System.out.println("Exception Found: " + a.getMessage());
        }

        try {
            Calculator d = new Calculator(10, 10);
            System.out.println("Subs: " + d.subst());
        } catch (ArithmeticException b) {
            System.out.println("Exception Found: " + b.getMessage());
        }

        try {
            Calculator e = new Calculator(10, 10);
            System.out.println("Mult: " + e.mult());
        } catch (ArithmeticException c) {
            System.out.println("Exception Found: " + c.getMessage());
        }

        try {
            Calculator f = new Calculator(10, 0);
            System.out.println("Div: " + f.division());
        } catch (ArithmeticException d) {
            System.out.println("Exception Found: " + d.getMessage());
        }

        // Example for message method
        try {
            Calculator g = new Calculator(1, 2);  // Passing valid numbers
            System.out.println("Message: " + g.msg());
        } catch (NumberFormatException e) {
            System.out.println("Exception Found: " + e.getMessage());
        }
    }
}