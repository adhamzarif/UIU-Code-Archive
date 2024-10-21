package Q_1_A;

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

    @Override
    public void m1() {
        System.out.println("Method m1()");
    }

    @Override
    public void m2() {
        System.out.println("Method m2()");
    }

    @Override
    public void m3() {
        System.out.println("Method m3()");
    }

    @Override
    public void m4() {
        System.out.println("Method m4()");
    }

    public static void main(String[] args) {
        Concrete obj = new Concrete();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
