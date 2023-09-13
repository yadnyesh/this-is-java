package io.yadnyesh.teluskoyoutube;


interface A{
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
    }

}


