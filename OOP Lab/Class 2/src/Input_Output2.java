import java.util.Scanner;

public class Input_Output2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your ID & Name: ");
        int id = sc.nextInt(); //int id = sc.nextDouble();
        sc.nextLine();
        String s;
        s = sc.nextLine();
        System.out.println(id + s);
    }
}
