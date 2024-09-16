package Problem2;

public class Driver extends User {
    private String vehicleType;
    private boolean isAvailable;

    public Driver(String name, int id, String vehicleType) {
        super(name, id);
        this.vehicleType = vehicleType;
        this.isAvailable = true; // Default availability is true when a driver is created
    }

    public boolean isAvailable() {  // Getter for isAvailable
        return isAvailable;
    }

    public void setAvailable(boolean available) {  // Setter for isAvailable
        this.isAvailable = available;
    }

    public void acceptRide(Ride ride) {
        if (isAvailable) {
            System.out.println("Ride Accepted");
            isAvailable = false; // Set to false after accepting a ride
        } else {
            System.out.println("Driver is not available");
        }
    }

    public void completeRide(Ride ride) {
        if (!ride.isCompleted()) {
            ride.completeRide();
            System.out.println("Ride completed for " + ride.getRideId());
            isAvailable = true; // Make driver available after completing the ride
        }
    }

    public void toggleAvailability() {
        isAvailable = !isAvailable; // Toggle availability status
    }
}



