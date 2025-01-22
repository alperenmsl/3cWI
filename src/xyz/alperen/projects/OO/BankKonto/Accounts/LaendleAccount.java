package xyz.alperen.projects.OO.BankKonto.Accounts;

public class LaendleAccount extends CheckingsAccount{
    private double cashbackRate; // Cashback-Satz

    public LaendleAccount(int limit, double cashbackRate) {
        super(limit);
        this.cashbackRate = cashbackRate;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        double cashback = amount * (cashbackRate / 100);
        System.out.println("Cashback von: " + cashback + "€ bekommen");
        balance += cashback;
    }
}
