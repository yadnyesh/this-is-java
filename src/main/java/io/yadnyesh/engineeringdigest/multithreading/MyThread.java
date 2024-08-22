package io.yadnyesh.engineeringdigest.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
            System.out.println("child thread");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }


}
