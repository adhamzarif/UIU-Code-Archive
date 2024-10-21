package Question1.b;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];

        try {

            System.out.print("Enter index position: ");
            int index = scanner.nextInt();

            System.out.print("Enter value to insert: ");
            int value = scanner.nextInt();

            myArray[index] = value;
            System.out.println("Value inserted successfully!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
        } finally {
            System.out.println("Exception handling is amazing");
        }
    }
}

