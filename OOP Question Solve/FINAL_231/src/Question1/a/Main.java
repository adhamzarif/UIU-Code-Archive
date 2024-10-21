package Question1.a;

/* Abstract class: A class that is declared abstract using
   the abstract keyword is known as an abstract class.
   It can have abstract and non-abstract methods (method with the body).
    We cannot create an object of an abstract class.
 */

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Bark!
        dog.sleep();      // Output: Sleeping...
    }
}

