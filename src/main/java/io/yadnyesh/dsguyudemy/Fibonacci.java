package io.yadnyesh.dsguyudemy;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        System.out.printf("Fibo is " + fibo(10));
    }

    public static int fibo(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n - 1;
        }
        else
            return fibo(n - 1) + fibo (n-2);
    }
}
