package xyz.alperen.projects.OO.BankKonto;

import xyz.alperen.projects.OO.BankKonto.Accounts.CheckingsAccount;
import xyz.alperen.projects.OO.BankKonto.Accounts.LaendleAccount;
import xyz.alperen.projects.OO.BankKonto.Accounts.SavingAccounts;

public class app {
    public static void main(String[] args) throws Exception {
        CheckingsAccount ca = new CheckingsAccount(3000);

        ca.deposit(5000);
        ca.withdraw(2000);
        ca.withdraw(2000);
        System.out.println(ca.getBalance() + "€");

        SavingAccounts sa = new SavingAccounts(3.15);
        sa.deposit(1000);
        sa.zinsBerechner();
        System.out.println("Savings Account Balance: " + sa.getBalance() + "€");

        LaendleAccount la = new LaendleAccount(2000, 1.0);
        la.deposit(1500);
        la.withdraw(600);
        System.out.println("Ländle Account Balance: " + la.getBalance() + "€");

    }
}
