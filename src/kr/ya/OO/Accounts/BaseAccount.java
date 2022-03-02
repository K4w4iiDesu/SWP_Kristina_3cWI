package kr.ya.OO.Accounts;

public class BaseAccount {
    private double balance;

    public BaseAccount(double balance){
        this.balance = balance;
    }

    public void deposit ( double depositAmount) {
        this.balance = this.balance  +depositAmount;
        System.out.println("Sie haben " + depositAmount + "€ eigezahlt, Ihre neuer Kontostand beträgt " + this.balance + "€");
    }

    public void withdraw(double withdrawAmount){
        this.balance = this.balance - withdrawAmount;
        System.out.println("Sie haben " + withdrawAmount + "€ abgehoben, Ihre neuer Kontostand beträgt " + this.balance + "€");
    }

    public void showBalance(){
        System.out.println("Ihre Kontostand beträgt " + this.balance + "€");
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

