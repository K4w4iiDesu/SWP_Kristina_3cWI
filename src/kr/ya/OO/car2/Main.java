package kr.ya.OO.car2;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Mercedes","Germany",10);
        Engine engine = new Engine(Engine.TYPE.DIESEL,50);
        Car car = new Car("blue",500,200000,10,60000,engine,producer);
        Truck t1 = new Truck("black",500,25000,15,60000,engine,producer,"trailer1");
        RaceCar rc1 = new RaceCar("blue",450,35000,10,500,engine, producer, "wing1");

        car.discount();
        car.Consumption();

        System.out.println(t1.getColor() + " " +t1.getTrailer());
        System.out.println(rc1.getColor()+ " " + rc1.getWing());

        t1.drive();
        t1.stop();
    }
}
