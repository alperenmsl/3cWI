package xyz.alperen.projects.OO.BankKonto.Accounts;

public class BaseAccount {
    protected double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.println("Deposit: " + amount);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
        this.balance -= amount;

    }
}
