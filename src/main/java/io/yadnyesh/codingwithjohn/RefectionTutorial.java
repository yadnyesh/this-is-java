package io.yadnyesh.codingwithjohn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefectionTutorial {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stela", 6);
        Field[] catField = myCat.getClass().getDeclaredFields();
        for(Field field: catField) {
            //System.out.println(field.getName());
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Jimmy");
            }
        }
        System.out.println(myCat.getName());

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method: catMethods) {
            if(method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }
            //System.out.println(method.getName());
        }
    }

}
