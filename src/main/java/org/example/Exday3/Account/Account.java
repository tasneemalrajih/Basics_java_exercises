package org.example.Exday3.Account;

public class Account  {
    String name;
    private double Balence;
    static double anwalreat = 0.4;


    public Account(String name,double Balence, double anwalreat){
        this.name=name;
        this.Balence=Balence;
        this.anwalreat=anwalreat;
    }
    public double PrsentReat(){
        double PReat = anwalreat/12;
        return PReat;
    }

    public  double GetMonthlyBalence(double PReat){
        return Balence * PReat ;
    }
    public void deposit(double account){

    }
    public void withdraw(double balance, double account) {
        if (account > 0 && account <= balance) {
            balance -= account;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }

    }

}
