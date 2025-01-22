package xyz.alperen.projects.OO.BankKonto;

import xyz.alperen.projects.OO.BankKonto.Accounts.CheckingsAccount;

public class app {
    public static void main(String[] args) throws Exception {
        CheckingsAccount ca = new CheckingsAccount(3000);
        ca.deposit(5000);
        ca.withdraw(2000);
        System.out.println(ca.getBalance() + "€");

    }
}
