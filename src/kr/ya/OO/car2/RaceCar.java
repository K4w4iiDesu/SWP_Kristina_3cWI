package kr.ya.OO.car2;

public class RaceCar extends Car{

    private String wing;

    public RaceCar(String color, int maxspeed, int price, double consumption, int mileage, Engine engine, Producer producer, String wing) {
        super(color, maxspeed, price, consumption, mileage, engine, producer);
        this.wing = wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
