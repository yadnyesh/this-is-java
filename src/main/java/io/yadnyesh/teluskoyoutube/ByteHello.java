package io.yadnyesh.teluskoyoutube;

public class ByteHello {
    public static void main(String[] args) {
            int num1 = 4;
            int num2 = 3;

            Calculator calculator = new Calculator();
            System.out.println(calculator.add(num1, num2));
        }
}

class Calculator {

    int a;

    public int add(int num1, int num2) {
        return num1 + num2;
    }


}
