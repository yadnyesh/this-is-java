package io.yadnyesh.educosys;

public class Recursion2 {
    static int i = 1;
    public static void recursiveFunction(int i) {
        if ( i > 10) return;
        else {
            System.out.println(i);
            recursiveFunction(i+1);
        }
    }

    public static void main(String[] args) {
        recursiveFunction(i);
    }
}
