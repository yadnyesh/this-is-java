package io.yadnyesh.teluskoyoutube;

import java.util.Arrays;

enum Status {
    Running, Failed, Pending, Status;
}

//1806542523 - Driving License Renewal Application Number

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println(s.ordinal());
        System.out.println(Arrays.stream(Status.values()).toList());
        System.out.println(s.getClass().getClassLoader());
        System.out.println(s.getClass().getSuperclass());
        System.out.println(s.getClass().getCanonicalName());
    }

}



