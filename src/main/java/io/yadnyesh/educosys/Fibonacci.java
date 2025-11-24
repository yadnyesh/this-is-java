package io.yadnyesh.educosys;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Program to print Fibonacci Series: " + Fibonacci.printFibonacciSeries(5));

    }

    public static int printFibonacciSeries(int n) {
        if (n <= 1) return n;
        else {
            n = printFibonacciSeries(n - 1) + printFibonacciSeries(n - 2);
            return n;
        }
    }
}
