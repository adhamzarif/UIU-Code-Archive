package ProblemV2.Problem1;

public class Sum {
    int x, y, z;

    // IIB1
    {
        System.out.println(x + y + z);
    }

    // IIB2
    {
        x = 10;
        y = 20;
        z = 30;
        System.out.println(x + y + z);
    }

    public Sum(int x) {
        this.x = x;
        System.out.println(x + y + z);
    }

    public Sum(int x, int y) {
        this(1000);  // Calls Constructor 1
        this.x = x;
        this.y = y;
        System.out.println(x + y + z);
    }

    public Sum(int x, int y, int z) {
        this(100, 200);  // Calls Constructor 2
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println(x + y + z);
    }

    public void display() {
        this.display("That's one small step for man, one giant leap for mankind.");
    }

    public void display(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Sum s = new Sum(10, 20, 30);
        s.display();
    }
}
