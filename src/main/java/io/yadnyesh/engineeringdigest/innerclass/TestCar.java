package io.yadnyesh.engineeringdigest.innerclass;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Maruti 800");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }

}
