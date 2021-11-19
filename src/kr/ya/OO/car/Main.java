package kr.ya.OO.car;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        car c1 = new car();
        c1.brand = "Mercedes";
        c1.fuelConsumption = 7;
        c1.serialNumber = "G500";
        c1.color = "white";
        c1.fuelAmount = 80;
        c1.fuelLeft = 75;


        car c2 = new car();
        c2. brand = "Audi";
        c2.fuelConsumption = 6;
        c2.serialNumber = "RSQ 8";
        c2.color = "blue";
        c2.fuelAmount = 70;
        c2.fuelLeft = 70;



        car c3 = new car();
        c3. brand = "Range Rover";
        c3.fuelConsumption = 5;
        c3.serialNumber = "V8";
        c3.color = "black";
        c3.fuelAmount = 60;
        c3.fuelLeft = 55;



        System.out.println(c2.serialNumber);
        System.out.println(c2.color);
        System.out.println(c2.brand);
        System.out.println(c2.fuelConsumption);

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        
    }
}
