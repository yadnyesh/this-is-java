package io.yadnyesh.conceptandcoding;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainAnnotation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
        Method[] methods = eagleClass.getMethods();
        for (Method method: methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class Name: " + method.getDeclaringClass());
            System.out.println("********");
        }
    }
}
