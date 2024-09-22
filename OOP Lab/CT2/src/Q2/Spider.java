package Q2;

public class Spider extends Animal {

    // Default constructor sets legs to 8
    public Spider() {
        super(8);  // Call the superclass constructor with 8 legs
    }

    @Override
    void eat() {
        System.out.println("Spider eats insects.");
    }
}

