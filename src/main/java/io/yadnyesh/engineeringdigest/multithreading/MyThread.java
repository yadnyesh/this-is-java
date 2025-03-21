package io.yadnyesh.engineeringdigest.multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  " -> Thread is running ....");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

    }
}
