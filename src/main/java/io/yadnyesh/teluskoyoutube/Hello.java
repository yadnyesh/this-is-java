package io.yadnyesh.teluskoyoutube;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("io.yadnyesh.teluskoyoutube.Mobile");
//        Mobile apple = new Mobile();
//        apple.brand = "Apple";
//        apple.price = 72000;
//
//        Mobile samsung = new Mobile();
//        samsung.brand = "Samsung";
//        samsung.price = 90000;
//
//        apple.show();
//        samsung.show();
        System.out.println("End of Program");



    }
}

class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static {
        name = "My Static Name";
        System.out.println("Inside static block");
    }

    public void show() {
        System.out.println(brand + ", " + price + ", " + network + ", " + name + ".");
    }

}