package kr.ya.OO.Accounts;

import javax.security.auth.login.CredentialException;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount(500,3,0.10);
        CheckingsAccount ca1 = new CheckingsAccount(400,5,0.13);
        LaendleAccount la1 = new LaendleAccount(200, 4);
        CreditAccount cra1 = new CreditAccount(-20,3);
        CreditAccount cra2 = new CreditAccount(10,5);

        sa1.accountInterest();
        sa1.deposit(150);
        sa1.withdraw(200);
        sa1.showBalance();

        ca1.accountInterest();

        la1.accountKeepingCosts();

        cra1.creditCosts();
        cra2.creditCosts();
    }
}
