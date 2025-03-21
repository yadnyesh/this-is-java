package io.yadnyesh.engineeringdigest.multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  " -> Thread is running ....");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("Hello post t1 thread execution is completed");
    }
}
