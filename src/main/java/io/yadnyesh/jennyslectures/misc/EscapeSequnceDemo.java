package io.yadnyesh.jennyslectures.misc;

public class EscapeSequnceDemo {
    public static void main(String[] args) {
        System.out.println("Progress: \n");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 10 + "%");
            try {
                Thread.sleep(500);
                System.out.print("\b\b\b\b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Yadnyesh, this is Done!");
    }
}
