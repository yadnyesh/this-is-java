package io.yadnyesh.teluskoyoutube;


interface A{

    int age = 42;
    int area = 105;
    void show();
    void config();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In B Show");
    }

    @Override
    public void config() {
        System.out.println("In B Config");
    }
}
public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
        System.out.println("age: " + b.age);
    }

}


