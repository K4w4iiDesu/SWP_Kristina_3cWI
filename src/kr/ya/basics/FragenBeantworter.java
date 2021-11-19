package kr.ya.basics;

import  java.util.Random;

public class FragenBeantworter {
        public static void main(String[] args) {
            Random random = new Random();
            int randomNumber = random.nextInt(150) + 1;
            if (randomNumber <= 100) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}
