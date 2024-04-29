package io.yadnyesh.teluskoyoutube;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if( j == 0) {
                throw new MyException("From my code");
            }

        } catch (ArithmeticException e) {
            j = 18;
            log.error("Exception.... with default output  --> " + e.getMessage());

        }
        catch (Exception e) {

            log.error("Something went wrong...." + e.getMessage());

        }
    }

}

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}
