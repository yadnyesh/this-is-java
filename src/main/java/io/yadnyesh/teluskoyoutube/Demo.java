package io.yadnyesh.teluskoyoutube;

import java.util.Arrays;

enum Laptop {
    Macbook (300000), DELL (150000), HP (), Thinkpad (60000);

    private int price;

    Laptop() {
        this.price = 500;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

//1806542523 - Driving License Renewal Application Number

@FunctionalInterface
interface A {
    public abstract void show();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In B Show");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = () -> System.out.println("In A's new implementation");
        obj.show();
    }

}



