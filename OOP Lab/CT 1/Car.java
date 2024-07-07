package Code;

import java.util.Scanner;

public class Car {
     double distance;
     double fuelConsumed;

    Car(double distance, double fuelConsumed) {
        this.distance = distance;
        this.fuelConsumed = fuelConsumed;
    }

    public double calculateMileage() {
        return distance / fuelConsumed;
    }

    public double calculateCost() {
        return fuelConsumed * 4;
    }
}

