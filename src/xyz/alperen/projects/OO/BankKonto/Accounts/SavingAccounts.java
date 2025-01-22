package xyz.alperen.projects.OO.BankKonto.Accounts;

public class SavingAccounts extends BaseAccount{
    private double zinssatz;

    public SavingAccounts(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public void zinsBerechner() {
        double zinsen = balance * (zinssatz / 100);
        System.out.println("Berechnete Zinsen: " + zinsen + "€");
        balance += zinsen;
    }


}
