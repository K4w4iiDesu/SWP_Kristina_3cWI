package kr.ya.basics;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    static void Ablage(){
        System.out.println(" ");
        System.out.println("--------");
        System.out.println(" ");
    }

    public static void main(String[] args ) {
        Random r = new Random();
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Drücken Sie die 1 um anzufangen!");
        int rnum = 0;
        int SpielerSumme = 0;
        int cnum = 0;
        int ComputerSumme = 0;
        int game = 0;
        while (game != 6)
            switch (eingabe.nextInt()) {
                case 1:
                    rnum = r.nextInt(6) + 1;
                    SpielerSumme = SpielerSumme + rnum;
                    cnum = r.nextInt(6) + 1;
                    ComputerSumme = ComputerSumme + cnum;
                    System.out.println("Sie haben die " + rnum + " gewürfelt");
                    System.out.println("Ihre summe ist " + SpielerSumme);
                    Ablage();
                    System.out.println("Der Computer hat die nummer " + cnum + " gewürfelt");
                    System.out.println("Die summe des Computers ist " + ComputerSumme);
                    Ablage();
                    System.out.println("Dücken Sie die 1 um Fortzufahren");
                    game++;
                    break;

            }
        if (SpielerSumme < ComputerSumme){
            System.out.println("Schade Marmelade! Sie haben mit der Zahl, " + SpielerSumme + " gegen die zahl, " + ComputerSumme + " Verloren!");
        }
        else if(SpielerSumme >ComputerSumme){
            System.out.println("Glückwunsch! Sie haben mit der Zahl, " + SpielerSumme + " gegen die zahl, " + ComputerSumme + " Gewonnen!");
        }
        else{
            System.out.println("Unentschieden! Sie haben beide die Zahl " + SpielerSumme + " gekriegt");
        }
    }

}
