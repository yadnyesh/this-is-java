package io.yadnyesh.jennyslectures;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int age = 25;
        float salary = 50000.0f;
        if (age > 20 && salary > 5000) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }
    }
}
