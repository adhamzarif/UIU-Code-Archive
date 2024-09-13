package Problem2;
//Parent
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
//Child
public class Car extends Vehicle {
    private String modelName;

    public Car(String brand, String modelName) {
        super(brand); // Invoking
        this.modelName = modelName;
    }

    @Override
    public void honk() {
        System.out.println("A vehicle horn is a sound-making device.");
        super.honk(); // Invoking
    }
    //Main
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang");
        myCar.honk(); // This will call the overridden method
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
