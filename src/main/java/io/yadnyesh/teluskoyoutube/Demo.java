package io.yadnyesh.teluskoyoutube;

enum Status {
    Running, Failed, Pending, Status;
}


public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
    }

}


