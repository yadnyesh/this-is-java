package io.yadnyesh.teluskoyoutube;

abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("I'm playing music inside the Car");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving WagonR");
    }
}


public class Demo {
    public static void main(String[] args) {
        Car m800 = new WagonR();
        m800.playMusic();
        m800.drive();
    }
}


