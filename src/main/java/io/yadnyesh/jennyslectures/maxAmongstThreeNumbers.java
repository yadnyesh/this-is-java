package io.yadnyesh.jennyslectures;

public class maxAmongstThreeNumbers {
    public static void main(String[] args) {
        int a = 100, b = 201, c = 30;

        int max = a>b ? (a>c ? a : c) : (b > c ? b : c);

        System.out.println("The maximum number is: " + max);
    }
}
