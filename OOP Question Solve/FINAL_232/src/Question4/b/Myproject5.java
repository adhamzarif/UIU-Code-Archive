package Question4.b;

public class Myproject5 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread(1, 5, 14);
        Mythread t2 = new Mythread(2, 17, 26);
        Mythread t3 = new Mythread(3, 29, 38);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        if (!t1.isAlive() && !t2.isAlive() && !t3.isAlive()) {
            double finalZ = t1.get_z() * t2.get_z() * t3.get_z();
            System.out.println("Final z value: " + finalZ);
        }
    }
}
