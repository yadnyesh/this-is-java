package io.yadnyesh.teluskoyoutube;

import io.yadnyesh.teluskoyoutube.calc.Calc;

public class Demo {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Sum of 10 + 12 is: " + calc.add(10, 12));
        System.out.println("Difference of 12 and 19 is: " + calc.sub(12, 10));

        ScientificCalc advCalc = new ScientificCalc();
        System.out.println(advCalc.multi(2,2));
        System.out.println(advCalc.add(2,5));
        System.out.println(advCalc.power(3,3));

    }
}


