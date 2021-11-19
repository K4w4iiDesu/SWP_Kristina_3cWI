package kr.ya.OO.RemoteControl;

public class Battery {
    private int Memorystatus;
    private int Batterystatus;

    public Battery(int batterystatus, int memorystatus) {
        Memorystatus = memorystatus;
        Batterystatus = batterystatus;
    }

    public void turnOn() {
        this.Batterystatus = (Batterystatus - 5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public int getMemorystatus() {
        return Memorystatus;
    }

    public void setMemorystatus(int memorystatus) {
        Memorystatus = memorystatus;
    }

    public int getBatterystatus() {
        return Batterystatus;
    }

    public void setBatterystatus(int  batterystatus) {
        Batterystatus = batterystatus;
    }
}
