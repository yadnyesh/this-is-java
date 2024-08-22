package io.yadnyesh.engineeringdigest.multithreading;

public class ThreadWorld implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("implements hello implements: " + i);
        }
    }
}
