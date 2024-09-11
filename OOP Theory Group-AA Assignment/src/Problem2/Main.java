package Problem2;

class Calculate {
    static int count = 10;  // Static variable
    static {
        System.out.println("United International University");
    }

    static int cube(int x) {
        return x * x * x;
    }

    public static void Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Calculate.Counter();
        Calculate c1 = new Calculate();
        c1.Counter();
        Calculate c2 = new Calculate();
        c2.Counter();
        System.out.println(c1.count);
        int result = Calculate.cube(Calculate.count);
        System.out.println(result);
    }
}