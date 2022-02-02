package kr.ya.Test.Motorsteuerung;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithmen algo1 = new Algorithmen("Test", 5);
        Algorithmen algo2 = new Algorithmen("Test2", 1);
        Algorithmen algo3 = new Algorithmen("Test3",3);
        Algorithmen algo4 = new Algorithmen("Test4",8);

        ArrayList<Algorithmen> algoList = new ArrayList<>(Arrays.asList(algo1,algo2));
        ArrayList<Algorithmen> algoList2 = new ArrayList<>(Arrays.asList(algo1,algo2,algo3,algo4));

        Motorsteuerung mot1 = new Motorsteuerung(algoList);
        Motorsteuerung mot2 = new Motorsteuerung(algoList2);

        System.out.println(mot1.getSumOfUsageForDistance(50));
        System.out.println(mot1.getNumberOfAlgorithms());
        System.out.println(mot1.getBestAlgorithmForDistance(50));
        mot1.printAllAlgorithms();

        System.out.println(mot2.getSumOfUsageForDistance(40));
        System.out.println(mot2.getNumberOfAlgorithms());
        System.out.println(mot2.getBestAlgorithmForDistance(70));
        mot2.printAllAlgorithms();
    }
}
