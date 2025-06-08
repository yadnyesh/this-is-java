package io.yadnyesh.jennyslectures;

public class BitWiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a & b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(" a & b = " + (a & b));
        System.out.println(" a | b = " + (a | b));
        System.out.println(" a ^ b = " + (a ^ b));
    }
}
