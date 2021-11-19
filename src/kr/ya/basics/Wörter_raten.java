package kr.ya.basics;

import java.util.Locale;
import java.util.Scanner;

public class Wörter_raten {
    static Scanner s = new Scanner(System.in);
    static String[] RandomWords = {"HTL Dornbirn", "Schultasche", "Computer", "Handy", "spielen", "Eisenbahn", "Muhamed kann nicht mehr", "               "};
    static int RandomNumber =(int) Math.floor(Math.random() * RandomWords.length);
    static String RandomWord = RandomWords [RandomNumber];
    static char[] RandomWordChars = new char [RandomWord.length()];
    static char [] GuessedChars = new char [RandomWord.length()];
    static boolean TheEnd = false;
    static String Guess ;
    static int Guesses;
    static int GoodGuesses;


    public static void main(String[] args) {
        for (int i = 0; i < RandomWord.length(); i++){
            RandomWordChars[i] = RandomWord.toLowerCase().charAt(i);
        }
        while (!TheEnd){
            printWord();
            guessChar();
        }
    }
    public static void printWord(){
        int countNumberOfStars = 0;
        boolean printStar;
        for (int i = 0; i <RandomWord.length(); i++) {
            printStar = true;
            for (int j = 0; j < RandomWord.length(); j++) {
                if (RandomWordChars[i] == GuessedChars[j]) {
                    System.out.print(RandomWord.charAt(i));
                    printStar = false;
                }
            }
            if (printStar) {
                System.out.print("*");
                countNumberOfStars++;
            }
        }
        System.out.println(" ");
        if (countNumberOfStars == 0) {
            congrarulateWinner();
        }
    }
    public static void guessChar() {
        boolean doItAgain = false;
        while (!doItAgain) {
            doItAgain=true;
            Guess = s.nextLine();
            if (Guess.equals(RandomWord)) {
                congrarulateWinner();
            } else {
                Guess = Guess.toLowerCase();
                for (int i = 0; i < GuessedChars.length; i ++) {
                    if (Guess.charAt(0) == GuessedChars[i]){
                        System.out.println("Du hast die Buchstaben erraten");
                        doItAgain = false;
                    }
                }
            }
            if (Guess.length() < 1){
                doItAgain = false;
            }
        }
        Guesses++;
        char guessFirstLetterLowerCase = Guess.charAt(0);
        for (int i = 0; i < RandomWord.length(); i++){
            if (guessFirstLetterLowerCase == RandomWordChars[i]) {
                GuessedChars[GoodGuesses] = guessFirstLetterLowerCase;
                GoodGuesses++;
                break;
            }
        }
    }
    public static void congrarulateWinner(){
        System.out.println("Glückwusch du hast das Wort erraten");
        System.out.println("Du brauchtest " + Guesses +" Vesuche!" );
        TheEnd = true;
    }
}





