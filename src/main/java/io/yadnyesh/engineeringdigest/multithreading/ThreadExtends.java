package io.yadnyesh.engineeringdigest.multithreading;

public class ThreadExtends extends Thread {

    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("extends hello extends: " + i);
        }
    }
}
