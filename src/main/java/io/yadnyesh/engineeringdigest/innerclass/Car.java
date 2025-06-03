package io.yadnyesh.engineeringdigest.innerclass;

public class Car {
    private String model;
    private boolean isEngineOn = false;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, boolean isEngineOn) {
        this.model = model;
        this.isEngineOn = isEngineOn;
    }

    class Engine {
        void start() {
            if (!isEngineOn) {
                System.out.println(model + " Engine started");
            } else {
                System.out.println(model + "Engine already running");
            }
        }

        void stop() {
            if(isEngineOn) {
                System.out.println(model + " Engine stopped");
            } else {
                System.out.println(model + " Engine not running");
            }
        }
    }


}
