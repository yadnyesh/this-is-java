package io.yadnyesh.codingwithdurgesh;

public class TestClass {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getSingletonExample();
        System.out.println(singletonExample.hashCode());
        SingletonExample singletonExample2 = SingletonExample.getSingletonExample();
        System.out.println(singletonExample2.hashCode());
        System.out.println("This is a test system for the upteenth time....");
    }
}
