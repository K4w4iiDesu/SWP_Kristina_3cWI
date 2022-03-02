package kr.ya.OO.Accounts;

public class CheckingsAccount extends BaseAccount {
    private double membershipYears;
    private double rateOfInterest;

    public CheckingsAccount(double balance, double membershipYears, double rateOfInterest){
        super(balance);
        this.membershipYears = membershipYears;
        this.rateOfInterest = rateOfInterest;
    }

    public void accountInterest(){
        double accountInterest = (this.getBalance() * this.rateOfInterest) * this.membershipYears;
        System.out.println("Sie haben über die letzten " + this.membershipYears + " Jahre " + accountInterest + " Zinsen gezahlt.");
        setBalance(getBalance() - accountInterest);
    }
}
