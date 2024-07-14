package Lab6.Interface;

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.printf("Plane can fly in the %s\n", Flyable.media);
    }

    @Override
    public boolean needFuel() {
        return true;
    }
}
