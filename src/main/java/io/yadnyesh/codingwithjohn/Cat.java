package io.yadnyesh.codingwithjohn;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow Method");
    }

    private void heyThisIsPrivate() {
        System.out.println("How was this heyThisIsPrivate was called?");
    }

    public static void thisIsAPublicStaticMethod() {
        System.out.println("I'm public and static");
    }

    private static void thisIsAPrivateStaticMethod() {
        System.out.println("I'm private and static");
    }
}
