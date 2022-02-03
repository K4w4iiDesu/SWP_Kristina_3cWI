package kr.ya.OO.car2;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Mercedes","Germany",10);
        Engine engine = new Engine(Engine.TYPE.DIESEL,50);
        Car car = new Car("blue",500,200000,10,60000,engine,producer);

        car.discount();
        car.Consumption();

    }
}
