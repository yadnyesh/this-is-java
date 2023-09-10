package io.yadnyesh.teluskoyoutube;

public class Demo {
    public static void main(String[] args) {
        Human yadnyesh = new Human();
        yadnyesh.setName("Yadnyesh Bharat Juvekar");
        yadnyesh.setAge(42);
        System.out.println(yadnyesh.getAge() + " " + yadnyesh.getName());
        Human varada  = new Human(12, "Varada");
        System.out.println(varada.getAge() + " " + varada.getName());

    }
}

class Human {
    private int age;
    private String name;

    public Human() {
        this.age = 11;
        this.name = "Yadnyesh"
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
