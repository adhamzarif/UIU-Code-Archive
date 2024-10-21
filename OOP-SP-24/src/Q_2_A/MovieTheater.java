package Q_2_A;

public class MovieTheater {
    int availableSeats;

    MovieTheater(int s) {
        availableSeats = s;
    }

    public synchronized int bookTickets(int numOfSeats) {
        int numOfTicketsBooked = 0;

        // Booking tickets one by one
        for (int i = 1; i <= numOfSeats; i++) {
            if (availableSeats > 0) {
                availableSeats--;
                numOfTicketsBooked++;
            }
        }
        return numOfTicketsBooked;
    }

    class User extends Thread {
        MovieTheater m;
        int numOfTickets;

        User(MovieTheater m, int numOfTickets, String name) {
            super(name);
            this.m = m;
            this.numOfTickets = numOfTickets;
        }

        @Override
        public void run() {
            int booked = m.bookTickets(numOfTickets);
            System.out.println(Thread.currentThread().getName() + " has booked " + booked + " tickets");
        }
    }

    public static void main(String[] args) {

        MovieTheater theater = new MovieTheater(15);

        User mina = theater.new User(theater, 6, "Mina");
        User nabil = theater.new User(theater, 8, "Nabil");
        User farhan = theater.new User(theater, 4, "Farhan");

        mina.start();
        nabil.start();
        farhan.start();

        try {
            mina.join();
            nabil.join();
            farhan.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Available tickets: " + theater.availableSeats);
    }
}

