package Question1.b;

// interface A with methods p() and q()
interface A {
    int p();
    int q();
}

// interface B with methods x() and y()
interface B {
    int x();
    int y();
}

// abstract class C implementing interfaces A and B and overriding their methods
abstract class C implements A, B {
    abstract int z();

    @Override
    public int p() {
        System.out.println("p()");
        return 1;
    }

    @Override
    public int q() {
        System.out.println("q()");
        return 1;
    }

    @Override
    public int x() {
        System.out.println("x()");
        return 1;
    }

    @Override
    public int y() {
        System.out.println("y()");
        return 1;
    }
}

// class D extending class C and overriding the z() abstract method
class D extends C {
    @Override
    public int z() {
        System.out.println("z()");
        return 1;
    }
}

/*/* No need to write the main method for the solution. This code is written to check the implementation of the classes and interfaces. */
public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.p();  // Output: p()
        obj.q();  // Output: q()
        obj.x();  // Output: x()
        obj.y();  // Output: y()
        obj.z();  // Output: z()
    }
}
