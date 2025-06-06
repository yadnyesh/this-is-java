package io.yadnyesh.jennyslectures;

import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("The name you entered is: " + firstName);
        String secondName = scanner.next();
        System.out.println("The second name you entered is: " + secondName);
    }
}
