package xyz.alperen.projects.OO.BankKonto.Accounts;

public class CheckingsAccount extends BaseAccount {
    private int limit;

    public CheckingsAccount (int limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) >(limit * -1)) {
            System.out.println("Withdraw " + amount + "€");
            this.balance -= amount;

        } else {
            System.out.println("Leider keine Deckung");

        }
    }
}
