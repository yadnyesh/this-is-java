package io.yadnyesh.jennyslectures;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        float weight = 70.0f; // in kilograms
        float height = 1.75f; // in meters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg and height in meters:");
        weight = scanner.nextFloat();
        height = scanner.nextFloat();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is: " + BMI);

    }
}
