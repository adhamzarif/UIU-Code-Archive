package Q_2_A;

class MovieTheater {
    int availableSeats;

    MovieTheater(int s) {
        availableSeats = s;
    }

    public synchronized int bookTickets(int numOFseats) {
        int numOfTicketsBooked = 0;
       
        for (int i = 1; i <= numOFseats; i++) {
            if (availableSeats > 0) {
                availableSeats--;
                numOfTicketsBooked++;
            }
        }
        return numOfTicketsBooked;
    }
}

class User extends Thread {
    MovieTheater m;
    int NumOfTickets;

    User(MovieTheater m, int n) {
        this.m = m;
        NumOfTickets = n;
    }

    public void run() {
        m.bookTickets(NumOfTickets);
    }
}

class Movie {
    public static void main(String[] args) {
        MovieTheater m = new MovieTheater(15);

        User mina = new User(m, 6);
        User nabil = new User(m, 8);
        User farhan = new User(m, 4);

        mina.start();
        nabil.start();
        farhan.start();

        try {
            mina.join();
            nabil.join();
            farhan.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(m.availableSeats);
        }
    }
}