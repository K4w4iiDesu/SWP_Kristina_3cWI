package kr.ya.Test.WashingMachine;

public class WashingMachine {
    private DetergentContainer detergentContainer;
    private Controller controller;

    public WashingMachine(DetergentContainer detergentContainer, Controller controller) {
        this.detergentContainer = detergentContainer;
        this.controller = controller;
    }

    public void turnOn() {
            this.controller.turnOn();
    }

    public void turnOff() {
       this.controller.turnOff();
    }

    public void startWashingProcess() {
        if(this.detergentContainer.getDetergentAmount() > 0){
            System.out.println("The Washing Machine is using program " + this.controller.getWashingProgram() + " it's expectet to take " + this.controller.getWashingTime() + " min.");
        }
        System.out.println("The Washing Machine is washing");
    }
}
