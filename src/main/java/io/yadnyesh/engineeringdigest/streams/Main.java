package io.yadnyesh.engineeringdigest.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    // print the sum of all even numbers in a given array

    public static void main(String[] args) {
        //imperative approach
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

        int sum2 = Arrays.stream(array).filter(n -> n % 2 ==0 ).sum();
        System.out.println(sum2);


        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        String[] myArray = {"apple", "banana", "cherry"};
        Stream<String> stringStream = Arrays.stream(myArray);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
    }

}
