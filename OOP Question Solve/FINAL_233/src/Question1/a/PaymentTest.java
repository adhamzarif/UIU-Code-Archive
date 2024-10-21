package Question1.a;

class CashPay extends Payment {
    public CashPay(double amount) {
        this.amount = amount;
    }

    @Override
    public double getCharge() {
        return 0;  // No charge for cash payment
    }
}

class CreditCardPay extends Payment {
    public CreditCardPay(double amount) {
        this.amount = amount;
    }

    @Override
    public double getCharge() {
        return amount * 0.025;  // 2.5% charge for credit card payment
    }
}

class CheckPay extends Payment {
    public CheckPay(double amount) {
        this.amount = amount;
    }

    @Override
    public double getCharge() {
        return 10;  // Flat charge of 10 Taka for check payment
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment cashPayment = new CashPay(1000);
        Payment creditCardPayment = new CreditCardPay(1000);
        Payment checkPayment = new CheckPay(1000);

        cashPayment.give();
        creditCardPayment.give();
        checkPayment.give();
    }
}
