package Question1.a;

public abstract class Payment implements Transaction {
    double amount;
    String currency = "BDT";

    @Override
    public void give() {
        double totalAmount = amount + getCharge() + getTax();
        System.out.println(currency + " " + totalAmount + " is paid");
    }

    @Override
    public void receive() {
        System.out.println("[Nothing to receive]");
    }

    public abstract double getCharge();

    public double getTax() {
        return amount * 0.156;
    }
}
