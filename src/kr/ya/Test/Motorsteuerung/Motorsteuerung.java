package kr.ya.Test.Motorsteuerung;


import java.util.ArrayList;
import java.util.Arrays;


public class Motorsteuerung {

    ArrayList<Algorithmen> algoList = new ArrayList<Algorithmen>();

    public Motorsteuerung(ArrayList<Algorithmen> algoList){
        this.algoList = algoList;
    }

    public int getSumOfUsageForDistance(int distance){
        int sum = 0;

        for (Algorithmen algo :
                algoList) {
            sum += algo.calculateUsageForDistance(distance);
        }

        return sum;
    }

    public int getNumberOfAlgorithms(){
        return algoList.size();
    }

    public int getBestAlgorithmForDistance(int distance){
        int[] resultList = new int[algoList.size()];

        for (int i = 0; i < algoList.size(); i++) {
            resultList[i] = algoList.get(i).calculateUsageForDistance(distance);
        }

        Arrays.sort(resultList);

        return resultList[0];
    }
    
    public void printAllAlgorithms(){
        for (Algorithmen algo :
                algoList) {
            System.out.println(algo.name);
        }
    }
}
