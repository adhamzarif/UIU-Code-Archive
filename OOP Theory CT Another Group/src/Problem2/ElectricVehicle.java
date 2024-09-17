package Problem2;

class ElectricVehicle extends Vehicle implements Engine {
    @Override
    public void addEngine() { // Made public
        // Implementation
    }

    @Override
    public void replaceEngine() { // Made public
        // Implementation
    }

    @Override
    public void repairEngine() { // Made public
        // Implementation
    }

    @Override
    double getSpeed(String engineType) {
        return 100.0;
    }
}