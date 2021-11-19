package kr.ya.basics;

public class Loops2 {
    public static void main(String[] args) {
        int l = 2;
        for(int i= 0; i<=1000; i = i + 2) {
            l = i +l;
            System.out.println(l);
        }
    }
}
