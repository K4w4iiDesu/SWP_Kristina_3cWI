package kr.ya.OO.car2;

public class Truck extends Car{

    private String trailer;

    public Truck(String color, int maxspeed, int price, double consumption, int mileage, Engine engine, Producer producer, String trailer) {
        super(color, maxspeed, price, consumption, mileage, engine, producer);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }


    public void drive() {
        System.out.println("I am driving the truck - consumption is high !!!");
    }
}
