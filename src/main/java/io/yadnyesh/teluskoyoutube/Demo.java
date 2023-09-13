package io.yadnyesh.teluskoyoutube;


class A {
    public void show() {
        System.out.println("In A show method");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show method");
    }
}
public class Demo {
    public static void main(String[] args) {
        A a = new A(){
            public void show() {
                System.out.println("In Anonymous class");
            }
        };
        a.show();
    }

}


