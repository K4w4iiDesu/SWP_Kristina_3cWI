package kr.ya.OO.car2;

public class Car {
    private String color;
    private int maxspeed;
    private int price;
    private double consumption;
    private int mileage;
    Engine engine;
    Producer producer;

    public Car(String color, int maxspeed, int price, double consumption, int mileage, Engine engine, Producer producer) {
        this.color = color;
        this.maxspeed = maxspeed;
        this.price = price;
        this.consumption = consumption;
        this.mileage = mileage;
        this.engine = engine;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void discount() {
        double discountedPride = this.price - (this.price * (this.producer.getDiscount()/100));
        System.out.println(discountedPride);
    }

    public void Consumption () {
        if (mileage>50000) {
            double Consumptionnew = this.consumption + (this.consumption * 0.098);
            setConsumption(Consumptionnew);
            System.out.println(consumption);
        } else {
            System.out.println(consumption);
        }
    }

    public void drive(){
        System.out.println("I am driving!!!");
    }

    public void stop(){
        System.out.println("I am breaking .... car!!!");
    }
}
