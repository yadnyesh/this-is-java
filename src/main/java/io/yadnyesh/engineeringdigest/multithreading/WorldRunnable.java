package io.yadnyesh.engineeringdigest.multithreading;

public class WorldRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Runnable: " + Thread.currentThread().getName());
        }
    }
}
