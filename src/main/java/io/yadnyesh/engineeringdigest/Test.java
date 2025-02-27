package io.yadnyesh.engineeringdigest;

import io.yadnyesh.engineeringdigest.multithreading.World;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        world.start();

        for(int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }
    }
}
