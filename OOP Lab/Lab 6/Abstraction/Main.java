package Lab6.IntroLearn;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird("Bird","Green");
        Animal t = new Tiger("Tiger","Black");
        b.eat();
        t.eat();
        b.makeSound();
        t.makeSound();
    }
}
