package io.yadnyesh.educosys;

public class TryRecursion {
    public static void main(String[] args) {
        TryRecursion.recursiveFunction(10);
    }

    public static void recursiveFunction(int n) {
        if (n == 0) {
            System.out.println("N is: " + n);
            return;
        }
        recursiveFunction(n - 1);
        System.out.println(n);
    }
}
