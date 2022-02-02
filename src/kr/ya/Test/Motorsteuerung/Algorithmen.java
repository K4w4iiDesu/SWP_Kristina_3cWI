package kr.ya.Test.Motorsteuerung;

public class Algorithmen {
    String name;
    int a;

    public Algorithmen(String name, int koeffizient){
        this.name = name;
        this.a = koeffizient;
    }

    public int calculateUsageForDistance(int distance){
        return (distance * 2)/a;
    }
}
