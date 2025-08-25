import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private int pin;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountHolder, int pin, double initialBalance) {
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean authenticate(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
