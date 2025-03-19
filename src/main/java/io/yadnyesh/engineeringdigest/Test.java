package io.yadnyesh.engineeringdigest;

import io.yadnyesh.engineeringdigest.multithreading.World;
import io.yadnyesh.engineeringdigest.multithreading.WorldRunnable;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        world.start();
        WorldRunnable worldRunnable = new WorldRunnable();
        Thread t1 = new Thread(worldRunnable);

        for(int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
