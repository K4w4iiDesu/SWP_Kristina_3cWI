package kr.ya.OO.car2;

public class Engine {
    public enum TYPE{DIESEL, BENZIN};
    private TYPE type;
    private int power;

    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
