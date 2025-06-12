package io.yadnyesh.jenkov;

public class MyThread extends Thread{

    public void run() {
        System.out.println("Matrix is running....");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
