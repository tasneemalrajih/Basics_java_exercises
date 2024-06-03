package org.example.Exday3.Account;

public class CheekAccount extends Account {

    public CheekAccount(String name, double Balence, double anwalreat) {
        super(name, Balence, anwalreat);
    }

    @Override
    public void withdraw(double balance, double account) {
        if (account > 0 && account <= balance) {
            balance -= account;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }

    }
}