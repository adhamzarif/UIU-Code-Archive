package Lab4.Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountType, String accountNumber, double initialBalance) {
        Account account;
        switch (accountType.toLowerCase()) {
            case "savings":
                account = new SavingsAccount(accountNumber, initialBalance);
                break;
            case "current":
                account = new CurrentAccount(accountNumber, initialBalance);
                break;
            case "student":
                account = new StudentAccount(accountNumber, initialBalance);
                break;
            default:
                System.out.println("Invalid account type");
                return;
        }
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found");
        return null;
    }
}

