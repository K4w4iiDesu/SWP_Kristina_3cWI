package kr.ya.OO.car;

public class car {
    int fuelConsumption;
    int fuelAmount;
    int fuelLeft;
    String serialNumber;
    String brand;
    String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving this car");
    }

    public void break1() {
        System.out.println("I brake");
    };

    public void turboBoost() {
        if (fuelLeft>fuelAmount*0.1) {
            System.out.println("Super Boost");
        }
        else {
            System.out.println("Flue too little");
        }
    }

    public void honk() {
        System.out.println("tuduuuu");
    }

    public void getRemainingRange() {
        float Range = fuelLeft / fuelConsumption * 100;
        System.out.println(Range+" km");
    }


}
