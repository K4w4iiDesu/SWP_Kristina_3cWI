package kr.ya.basics;

import java.util.Random;

public class While1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = 0;
        int r = 0;

        while (randomNumber !=15 && randomNumber!=25) {
            r = randomNumber + r;
            randomNumber = random.nextInt(21) +10;
            System.out.println(r);

        }
    }
}
