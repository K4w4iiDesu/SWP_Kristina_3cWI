package kr.ya.Test.WashingMachine;


public class Main {
    public static void main(String[] args) {
        DetergentContainer dc = new DetergentContainer(0);
        Controller c = new Controller(dc);
        WashingMachine wm = new WashingMachine(dc,c);


        wm.turnOn();
        c.washingProgram(2);
        c.detergentAmount(100);
        c.checkDetergentAmount();
        wm.startWashingProcess();
        wm.turnOff();
    }
}
