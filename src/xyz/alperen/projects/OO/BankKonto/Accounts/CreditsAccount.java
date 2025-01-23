package xyz.alperen.projects.OO.BankKonto.Accounts;

public class CreditsAccount extends BaseAccount{
    private double creditLimit;
    private double zinssatz;

    public CreditsAccount(double creditLimit, double zinssatz) {
        this.creditLimit = creditLimit;
        this.zinssatz = zinssatz;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= (creditLimit * -1)) {
            System.out.println("Withdrawn: " + amount + "€");
            balance -= amount;
        } else {
            System.out.println("Withdrawal nicht akzeptiert! Kredit limit überschritten.");
        }
    }

    public void zinsBerechner() {
        if (balance < 0) {
            double zinsen = Math.abs(balance) * (zinssatz / 100);
            System.out.println("Berechnete zinsen auf Schulden: " + zinsen + "€");
            balance -= zinsen;
        }
    }
}

