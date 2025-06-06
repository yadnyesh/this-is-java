package io.yadnyesh.jennyslectures;

import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        int a = 10;
        System.out.println(a++ - ++a);
        System.out.println(++a - a++);

    }
}
