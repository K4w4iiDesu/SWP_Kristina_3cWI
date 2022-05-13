package kr.ya.Test.WashingMachine;

public class Controller {
    private DetergentContainer detergentContainer;
    private int washingProgram;
    private int washingTime;
    private boolean machineState;



    public Controller(DetergentContainer detergentContainer) {
        this.detergentContainer = detergentContainer;
    }

    public int getWashingTime() {
        return washingTime;
    }

    public void setWashingTime(int washingTime) {
        this.washingTime = washingTime;
    }

    public int getWashingProgram() {
        return washingProgram;
    }

    public void setWashingProgram(int washingProgram) {
        this.washingProgram = washingProgram;
    }

    public void washingProgram(int washingProgram) {
        if (washingProgram == 1) {
            this.washingTime = 40;
            setWashingTime(40);
            setWashingProgram(1);
            System.out.println("fast " + this.washingTime + " min");

        } else if (washingProgram == 2) {
            this.washingTime = 60;
            setWashingTime(60);
            setWashingProgram(2);
            System.out.println("Medium " + this.washingTime + " min");

        } else if (washingProgram == 3) {
            this.washingTime = 120;
            setWashingTime(120);
            setWashingProgram(3);
            System.out.println("slow " + this.washingTime + " min");
        }
    }

    public void detergentAmount(int amountOfDetergent){
        int newDetergentAmount;
        newDetergentAmount = this.detergentContainer.getDetergentAmount() + amountOfDetergent;
        this.detergentContainer.setDetergentAmount(newDetergentAmount);
    }
    public void checkDetergentAmount() {
        System.out.println(this.detergentContainer.getDetergentAmount());
        if (this.detergentContainer.getDetergentAmount() == 0) {
            System.out.println("Fill up your Detergent Container");
        }
    }

    public void turnOn() {
        if (machineState == false) {
            machineState = true;
            System.out.println("The Washing Machine is On");
        }
    }

    public void turnOff() {
        if (machineState == true) {
            machineState = false;
            System.out.println("The Washing Machine is Off");
        }
    }
}
