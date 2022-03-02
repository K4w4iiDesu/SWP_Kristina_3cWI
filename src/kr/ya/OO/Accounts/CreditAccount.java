package kr.ya.OO.Accounts;

public class CreditAccount extends BaseAccount {
    private double loanInterest = 0.05;
    private double creditLimit = -50;
    private double loanMonths;

    public CreditAccount(double balance, double loanMonths) {
        super(balance);
        this.loanMonths = loanMonths;
    }

    public void creditCosts(){
        double creditCosts = 0;
        if(this.getBalance() <= this.creditLimit){
            System.out.println("Sie haben das Kontolimit überschnitten.");
        }
        else if(this.getBalance() >= 0){
            System.out.println("Sie müssen keine Kreditkosten abzahlen.");
        }
        else{
            creditCosts = (-this.getBalance() * this.loanInterest) * this.loanMonths;
            System.out.println("Sie müssen " + creditCosts + "€ Kreditzinsen zahlen.");
            setBalance(getBalance() - creditCosts);
        }
    }

    public double getLoanInterest(){
        return loanInterest;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public double getLoanMonths(){
        return loanMonths;
    }
}


