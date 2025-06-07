package io.yadnyesh.jennyslectures;

public class AssignmentRelationalLogicalDemo {
    public static void main(String[] args) {
        String one = "yadnyesh";
        String two = "yadnyesh";
        System.out.println(one == two);
        System.out.println(System.identityHashCode(one));
        System.out.println(System.identityHashCode(two));

    }
}
