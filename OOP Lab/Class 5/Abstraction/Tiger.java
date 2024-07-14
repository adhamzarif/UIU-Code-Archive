package Lab6.IntroLearn;

class Tiger extends Animal{
    public Tiger(String name, String color) {
        super(name, color);
    }
    @Override
    public void makeSound() { System.out.println("Roar"); }
    public void methodTiger() { System.out.println("methodTiger"); }

}
