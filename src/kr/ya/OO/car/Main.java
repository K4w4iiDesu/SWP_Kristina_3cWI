package kr.ya.OO.car;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        car c1 = new car();
        c1.brand = "Mercedes";
        c1.fuelCousumption = 7;
        c1.serialNumber = "G500";
        c1.color = "white";
        c1.fuelAmount = 80;


        car c2 = new car();
        c2. brand = "Audi";
        c2.fuelCousumption = 6;
        c2.serialNumber = "RSQ 8";
        c2.color = "blue";
        c2.fuelAmount = 70;

        car c3 = new car();
        c3. brand = "Range Rover";
        c3.fuelCousumption = 5;
        c3.serialNumber = "V8";
        c3.color = "black";
        c3.fuelAmount = 60;


        System.out.println(c1.serialNumber);
        System.out.println(c1.color);
        System.out.println(c2.brand);
        System.out.println(c3.fuelCousumption);
    }
}
