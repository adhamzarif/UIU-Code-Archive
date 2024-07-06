package Lab2.BankInfo;

public class Main {
        public static void main(String[] args) {
            BankAccount user1 = new BankAccount("Zarif", "2431231454");
            user1.depositMoney(200);
            user1.withdrawMoney(50);
            System.out.println(user1.uName + " " + user1.deposit);

            BankAccount user2 = new BankAccount("Adham", "46546545645");
            user2.depositMoney(500);
            user2.withdrawMoney(150);
            System.out.println(user2.uName + " " + user2.deposit);
        }
    }
