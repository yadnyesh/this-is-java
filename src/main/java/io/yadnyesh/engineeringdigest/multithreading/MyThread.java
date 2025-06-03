package io.yadnyesh.engineeringdigest.multithreading;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": is running");
            Thread.yield();
        }

            try {
                Thread.sleep(1000);
                //System.out.println("Thread is running...");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        t1.start();
        t2.start();
    }
}
