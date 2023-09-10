package io.yadnyesh.teluskoyoutube;

public class Demo {
    public static void main(String[] args) {
        B b = new B();

    }
}

class A {
    public A() {
        System.out.println("Inside the constructor of A");
    }
}

class B extends A {
    public B(){
        System.out.println("Inside the constructor of B");
    }
    public B(int b){
        System.out.println("Inside the parameterised constructor of B");
    }
}


class Human {
    private int age;
    private String name;

    public Human() {
        this.age = 11;
        this.name = "Yadnyesh";
        System.out.println("Inside the constructor");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
