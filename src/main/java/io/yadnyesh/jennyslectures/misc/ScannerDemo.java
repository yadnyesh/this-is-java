package io.yadnyesh.jennyslectures.misc;

import java.io.IOException;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        int a = 10;
        System.out.println(a++ - ++a);
        System.out.println(++a - a++);

    }
}
