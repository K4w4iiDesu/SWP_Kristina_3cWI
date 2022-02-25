package kr.ya.OO.Calculator;

public class Main {
    public static void main(String[] args) {

    Calculator c = new Calculator();
    Scientific_Calculator sc = new Scientific_Calculator();
    Root_Calculator rc = new Root_Calculator();

        System.out.println(c.multiply(1,2));
        System.out.println(c.addition(1,2));
        System.out.println(c.subtraction(1,2));
        System.out.println(c.division(1,2));
        System.out.println(sc.cos(10));
        System.out.println(sc.sin(10));
        System.out.println(rc.root(25));
        System.out.println(rc.addition(1,2));
        System.out.println(rc.multiply(1,2));
        System.out.println(sc.division(1,2));
        System.out.println(sc.addition(1,2));

    }
}
