package io.yadnyesh.engineeringdigest.multithreading;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " <--> " + Thread.currentThread().getPriority() + " -> Thread is running ....");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread h = new MyThread("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

        System.out.println("Hello post t1 thread execution is completed");
    }
}
