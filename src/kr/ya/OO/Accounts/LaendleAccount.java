package kr.ya.OO.Accounts;

public class LaendleAccount extends BaseAccount{
    private double membershipYears;
    private double accountManagement =50;

    public LaendleAccount(double balance, double membershipYears){
        super(balance);
        this.membershipYears = membershipYears;
    }

    public void accountKeepingCosts(){
        double accountKeepingCosts = 0;
        for(int i = 0; i < getMembershipYears(); i++){
            accountKeepingCosts = accountManagement + this.accountManagement;
        }
        System.out.println("Ihre Ländlegirokonto kosteten ihenen seit ihrers Kontoeröffnung " + accountKeepingCosts + "€");
        setBalance(getBalance() - accountKeepingCosts);
    }

    public double getMembershipYears(){
        return membershipYears;
    }

    public double getAccountManagement(){
        return accountManagement;
    }
}
