package org.example.Exday3.Account;

public class SavingAccount extends Account{
    private double limet;

    public SavingAccount(String name, double Balence, double anwalreat,double limet) {
        super(name, Balence, anwalreat);
        this.limet=limet;
    }

    @Override
    public void withdraw(double balance, double account) {
       double wi= balance -= account;
        if(wi >= limet){
           balance-=account;
        }else {
            System.out.println("Limet");
        }

    }
}
