package io.yadnyesh.engineeringdigest.multithreading;

public class World extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
