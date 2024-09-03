package Lab6.Interface;

class Bird implements Flyable{
    @Override
    public void fly(){ System.out.printf("Bird can fly in the %s\n", Flyable.media);}
    @Override
    public boolean needFuel() { return false; }
}
