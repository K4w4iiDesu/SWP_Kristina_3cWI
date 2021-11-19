package kr.ya.OO.car;

public class car {
    double fuelCousumption;
    int fuelAmount;
    String serialNumber;
    String brand;
    String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelCousumption;
        System.out.println();
    }


}
