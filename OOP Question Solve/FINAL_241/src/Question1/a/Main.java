package Question1.a;

interface Inf1 {
    void m1();
    void m2();
}

interface Inf2 {
    void m3();
}

abstract class Abs {
    abstract void m4();
}

class Concrete extends Abs implements Inf1, Inf2 {
    public void m1() {
        System.out.println("m1 method");
    }

    public void m2() {
        System.out.println("m2 method");
    }

    public void m3() {
        System.out.println("m3 method");
    }

    @Override
    public void m4() {
        System.out.println("m4 method");
    }

    public static void main(String[] args) {
        Concrete obj = new Concrete();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}

