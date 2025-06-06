package io.yadnyesh.jennyslectures;

import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Youtube channel name generator!");
        System.out.println("What is your nick name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is the next word you want to add?");
        String nextWord = scanner.nextLine();
        System.out.println("Your channel name is: " + name + " " + nextWord);

    }
}
