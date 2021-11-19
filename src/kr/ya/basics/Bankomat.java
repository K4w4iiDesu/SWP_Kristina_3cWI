package kr.ya.basics;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");
        boolean on = true;
        int balance = 0;
        while (on = true) {
            Scanner Ay = new Scanner(System.in);
            int Selection = Ay.nextInt();
            switch (Selection) {
                case 1:
                    System.out.println("Bitte geben Sie den Betrag den Sie einzahlen wollen.");
                    int money = Ay.nextInt();
                    balance = balance + money;
                    System.out.println("Es wurden" +" " + money + " " + "mone eingezahlt.");
                    break;
                case 2:
                    System.out.println("Bitte geben Sie den Betrag den Sie abheben wöllen.");
                    int geld = Ay.nextInt();
                    balance = balance - geld;
                    System.out.println("Es wurden" +" " + geld + " " + "mone abhebent.");
                    break;
                case 3:
                    System.out.println("Sie haben" + " " + balance + " " + "mone.");
                    break;
                case 4:
                    System.out.println("Es wird off gestellt");
                    on = false;
            }
        }
    }
}
