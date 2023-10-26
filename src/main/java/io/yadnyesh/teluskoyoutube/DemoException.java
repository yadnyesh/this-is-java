package io.yadnyesh.teluskoyoutube;

public class DemoException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (j == 0) {
                throw new ArithmeticException("This is an exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception...." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong...." + e.getMessage());
        }
    }
}
