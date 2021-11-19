package kr.ya.basics;

import java.util.Random;

public class Bedingung {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if (randomNumber < 20) {
            System.out.println(randomNumber + "Mini");

        } else if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println(randomNumber + "Medium");

        } else if (randomNumber > 50) {
            System.out.println(randomNumber + "Large");
        }
    }
}
