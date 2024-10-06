package Problem1;

public class UsrException extends Exception {
    public UsrException(String message) {
        super(message);  // Calls the parent Exception constructor with a message
    }
}

class Building {
    int id;
    int floorSize;
    int noOfFloors;
    int noOfUnits;
    float perSquareFeetPrice;

    Building() {
    }

    Building(int floorSize, int noOfFloors, int noOfUnits) {
        this.floorSize = floorSize;
        this.noOfFloors = noOfFloors;
        this.noOfUnits = noOfUnits;
    }

    public static int check(int floorSize, int noOfFloors, int noOfUnits) throws UsrException {
        if (noOfFloors < 5) {
            throw new UsrException("Not enough floors!");
        } else if (noOfUnits < 2) {
            throw new UsrException("Not enough units!");
        } else if (floorSize < 1800) {
            throw new UsrException("Not big enough!");
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", floorSize=" + floorSize +
                ", noOfFloors=" + noOfFloors +
                ", noOfUnits=" + noOfUnits +
                ", perSquareFeetPrice=" + perSquareFeetPrice +
                '}';
    }

    public static void main(String[] args) {
        try {
            int checking = check(2000, 6, 3);
            System.out.println("Check passed! Result: " + checking);
        } catch (UsrException e) {
            System.out.println("Exception Found: " + e.getMessage());
        }
    }
}
