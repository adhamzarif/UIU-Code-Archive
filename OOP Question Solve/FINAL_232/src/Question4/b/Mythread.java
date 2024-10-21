package Question4.b;

public class Mythread extends Thread {
    private int tid; // Thread ID
    private int startValue, endValue, inc;
    private double z;

    public Mythread(int id, int sv, int ev) {
        this.tid = id;
        this.startValue = sv;
        this.endValue = ev;
        this.inc = 3; // increment
        this.z = 1.0;
    }

    public void run() {
        for (int i = startValue; i <= endValue; i += inc) {
            z *= (1.0 / i);
        }
    }

    public double get_z() {
        return z;
    }
}

