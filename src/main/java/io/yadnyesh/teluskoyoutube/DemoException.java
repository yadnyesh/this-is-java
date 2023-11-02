package io.yadnyesh.teluskoyoutube;

public class DemoException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if( j == 0) {
                throw new ArithmeticException("From my code");
            }

        } catch (ArithmeticException e) {
            j = 18;
            System.out.println("Exception.... with default output" + e.getMessage());

        }
        catch (Exception e) {

            System.out.println("Something went wrong...." + e.getMessage());

        }
    }

}

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}
