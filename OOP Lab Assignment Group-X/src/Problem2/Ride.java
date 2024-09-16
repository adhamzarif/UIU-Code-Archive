package Problem2;

public class Ride {
    private static int rideCounter = 1;
    private int rideId;
    private Location fromLocation;
    private Location toLocation;
    private boolean isCompleted;

    public Ride(User user, Location from, Location to, boolean isCompleted) {
        this.rideId = rideCounter++;
        this.fromLocation = from;
        this.toLocation = to;
        this.isCompleted = isCompleted;
    }

    public void completeRide() {
        isCompleted = true;
    }

    public String getRideInfo() {
        return "Ride ID: " + rideId + ", From: " + fromLocation.getPlace() + ", To: " + toLocation.getPlace();
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getRideId() {
        return rideId;
    }
}

