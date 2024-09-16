package Problem2;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Ride requestRide(Location from, Location to) {
        return new Ride(this,from,to,false);
    }

    public String getUserInfo() {
        return "Name: " + name + ", ID: " + id;
    }
}

