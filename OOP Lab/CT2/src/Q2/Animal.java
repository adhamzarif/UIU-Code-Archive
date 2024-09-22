package Q2;

abstract class Animal {
    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();  // Abstract method

    void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
}
