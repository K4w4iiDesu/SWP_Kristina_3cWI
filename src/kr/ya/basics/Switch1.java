package kr.ya.basics;

import java.util.Random;

public class Switch1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(5 );
        randomNumber += 5;

        System.out.println(randomNumber);

        switch(randomNumber){
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
        }
    }
}
