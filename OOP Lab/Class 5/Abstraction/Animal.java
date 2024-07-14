package Lab6.IntroLearn;

abstract class Animal{
    // instance variables
    String name, color;
    double weight;
    // Constructors
    Animal(){ }
    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    // Concrete methods
    public void eat(){ System.out.println(name + " eats."); }
    // abstract methods
    public abstract void makeSound();

}
