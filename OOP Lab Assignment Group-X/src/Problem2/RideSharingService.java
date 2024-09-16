package Problem2;

import java.util.ArrayList;

public class RideSharingService {
    private ArrayList<Ride> rides = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Driver> drivers = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public Ride requestRide(User user, Location from, Location to) {
        Ride newRide = user.requestRide(from, to);
        rides.add(newRide);
        System.out.println("Ride requested: " + newRide.getRideInfo());
        return newRide;
    }

    public void completeRide(Driver driver, Ride ride) {
        driver.completeRide(ride);
        ride.completeRide();
    }
}

