package kr.ya.basics;

import java.util.Scanner;

public class TicTacToe {

    private static char Null;

    public static void feldAusfüllen(char[][] SpielFeld) {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (SpielFeld[row][col] == Null) {
                    SpielFeld[row][col] = '-';
                }
                System.out.print(" |" + SpielFeld[row][col] + "| ");
            }
            System.out.println();
        }
    }



    public static void Spieler2(char[][] SpielFeld) {

        Scanner eingabe = new Scanner(System.in);

        int selection = eingabe.nextInt();
        switch (selection) {
            case 1:
                if (SpielFeld[0][0] == 'X' | SpielFeld[0][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[0][0] = 'O';
                break;
            case 2:
                if (SpielFeld[0][1] == 'X' | SpielFeld[0][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[0][1] = 'O';
                break;
            case 3:
                if (SpielFeld[0][2] == 'X' | SpielFeld[0][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[0][2] = 'O';
                break;
            case 4:
                if (SpielFeld[1][0] == 'X' | SpielFeld[1][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[1][0] = 'O';
                break;
            case 5:
                if (SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[1][1] = 'O';
                break;
            case 6:
                if (SpielFeld[1][2] == 'X' | SpielFeld[1][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[1][2] = 'O';
                break;
            case 7:
                if (SpielFeld[2][0] == 'X' | SpielFeld[2][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[2][0] = 'O';
                break;
            case 8:
                if (SpielFeld[2][1] == 'X' | SpielFeld[2][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[2][1] = 'O';
                break;
            case 9:
                if (SpielFeld[2][2] == 'X' | SpielFeld[2][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler2(SpielFeld);
                    break;
                }
                SpielFeld[2][2] = 'O';
                break;

        }
    }

    public static void Spieler1(char[][] SpielFeld) {

        Scanner eingabe = new Scanner(System.in);

        int selection = eingabe.nextInt();
        switch (selection) {
            case 1:
                if (SpielFeld[0][0] == 'X' | SpielFeld[0][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[0][0] = 'X';
                break;
            case 2:
                if (SpielFeld[0][1] == 'X' | SpielFeld[0][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[0][1] = 'X';
                break;
            case 3:
                if (SpielFeld[0][2] == 'X' | SpielFeld[0][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[0][2] = 'X';
                break;
            case 4:
                if (SpielFeld[1][0] == 'X' | SpielFeld[1][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[1][0] = 'X';
                break;
            case 5:
                if (SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[1][1] = 'X';
                break;
            case 6:
                if (SpielFeld[1][2] == 'X' | SpielFeld[1][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[1][2] = 'X';
                break;
            case 7:
                if (SpielFeld[2][0] == 'X' | SpielFeld[2][0] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[2][0] = 'X';
                break;
            case 8:
                if (SpielFeld[2][1] == 'X' | SpielFeld[2][1] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[2][1] = 'X';
                break;
            case 9:
                if (SpielFeld[2][2] == 'X' | SpielFeld[2][2] == 'O') {
                    System.out.println("Besetzt");
                    Spieler1(SpielFeld);
                    break;
                }
                SpielFeld[2][2] = 'X';
                break;

        }
    }

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        char SpielFeld[][] = new char[3][3];
        int SpielLäuft = 0;

        feldAusfüllen(SpielFeld);


        while (SpielLäuft == 0) {

            Spieler1(SpielFeld);

            feldAusfüllen(SpielFeld);

            //WinConditions
            for (int row = 0; row < 3; row++) {
                if (SpielFeld[row][0] == SpielFeld[row][1] && SpielFeld[row][1] == SpielFeld[row][2] && SpielFeld[row][0] == 'X' | SpielFeld[row][0] == 'O') {
                    SpielLäuft = SpielLäuft + 1;
                }
            }
            for (int col = 0; col < 3; col++) {
                if (SpielFeld[0][col] == SpielFeld[1][col] && SpielFeld[1][col] == SpielFeld[2][col] && SpielFeld[0][col] == 'X' | SpielFeld[0][col] == 'O') {
                    SpielLäuft = SpielLäuft + 1;
                }
            }

            if (SpielFeld[0][0] == SpielFeld[1][1] && SpielFeld[1][1] == SpielFeld[2][2] && SpielFeld[0][0] == 'X' | SpielFeld[0][0] == 'O' && SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O' && SpielFeld[2][2] == 'X' | SpielFeld[2][2] == 'O') {
                SpielLäuft = SpielLäuft + 1;
            }

            if (SpielFeld[2][0] == SpielFeld[1][1] && SpielFeld[1][1] == SpielFeld[0][2] && SpielFeld[2][0] == 'X' | SpielFeld[2][0] == 'O' && SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O' && SpielFeld[0][2] == 'X' | SpielFeld[0][2] == 'O') {
                SpielLäuft = SpielLäuft + 1;
            }

            if (SpielFeld[0][0] != '-' && SpielFeld[1][0] != '-' && SpielFeld[2][0] != '-' && SpielFeld[0][1] != '-' && SpielFeld[0][2] != '-' && SpielFeld[1][1] != '-' && SpielFeld[1][2] != '-' && SpielFeld[2][1] != '-' && SpielFeld[2][2] != '-'){
                SpielLäuft = SpielLäuft + 1;
            }

            if (SpielLäuft ==0) {
                Spieler2(SpielFeld);

                feldAusfüllen(SpielFeld);

                //WinConditions
                for (int row = 0; row < 3; row++) {
                    if (SpielFeld[row][0] == SpielFeld[row][1] && SpielFeld[row][1] == SpielFeld[row][2] && SpielFeld[row][0] == 'X' | SpielFeld[row][0] == 'O') {
                        SpielLäuft = SpielLäuft + 1;
                    }
                }

                for (int col = 0; col < 3; col++) {
                    if (SpielFeld[0][col] == SpielFeld[1][col] && SpielFeld[1][col] == SpielFeld[2][col] && SpielFeld[0][col] == 'X' | SpielFeld[0][col] == 'O') {
                        SpielLäuft = SpielLäuft + 1;
                    }
                }

                if (SpielFeld[0][0] == SpielFeld[1][1] && SpielFeld[1][1] == SpielFeld[2][2] && SpielFeld[0][0] == 'X' | SpielFeld[0][0] == 'O' && SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O' && SpielFeld[2][2] == 'X' | SpielFeld[2][2] == 'O') {
                    SpielLäuft = SpielLäuft + 1;
                }

                if (SpielFeld[2][0] == SpielFeld[1][1] && SpielFeld[1][1] == SpielFeld[0][2] && SpielFeld[2][0] == 'X' | SpielFeld[2][0] == 'O' && SpielFeld[1][1] == 'X' | SpielFeld[1][1] == 'O' && SpielFeld[0][2] == 'X' | SpielFeld[0][2] == 'O') {
                    SpielLäuft = SpielLäuft + 1;
                }

                if (SpielFeld[0][0] != '-' && SpielFeld[1][0] != '-' && SpielFeld[2][0] != '-' && SpielFeld[0][1] != '-' && SpielFeld[0][2] != '-' && SpielFeld[1][1] != '-' && SpielFeld[1][2] != '-' && SpielFeld[2][1] != '-' && SpielFeld[2][2] != '-'){
                    SpielLäuft = SpielLäuft + 1;
                }
            }
        }
    }
}

