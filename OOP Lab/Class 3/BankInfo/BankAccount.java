//Create a Banking Application, where a user can create new account, deposit money, withdraw
//money and check the balance.
public class BankAccount {
  String uName;
  String holdingNumber;
  int deposit = 0;

  // Constructor Creation
  public BankAccount(String uName, String holdingNumber) {
    this.uName = uName;
    this.holdingNumber = holdingNumber;
  }

  // Method Creation
  public int depositMoney(int amount) {
    if (amount > 0) {
      deposit += amount;
    } else {
      System.out.println("Please Enter a positive number!!");
    }
    return deposit;
  }

  public int withdrawMoney(int amount) {
    if (deposit > 0 && amount <= deposit) {
      deposit -= amount;
    } else {
      System.out.println("Please enter a valid number!!");
    }
    return deposit;
  }

  public int currentBalance() {
    return deposit;
  }
}
