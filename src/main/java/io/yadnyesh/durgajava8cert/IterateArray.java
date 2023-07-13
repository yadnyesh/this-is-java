package io.yadnyesh.durgajava8cert;

public class IterateArray {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4};
        int i = 0;

        do {
            System.out.println(myArray[i] + " ");
            i++;
        } while ( i < (myArray.length-1));
    }
}
