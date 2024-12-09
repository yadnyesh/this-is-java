package io.yadnyesh.engineeringdigest.multithreading;

import io.yadnyesh.engineeringdigest.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Yadnyesh", 4.9));
        list.add(new Student("Charlie", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Akshat", 3.9));

        list.sort(null);
        System.out.println(list.toString());
    }
}
