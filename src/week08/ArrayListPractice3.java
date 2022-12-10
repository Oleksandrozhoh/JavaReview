package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice3 {
    public static void main(String[] args) {

        /*
        write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 5
            output:
                4
         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList( 1,2,3,4,5,6,7,7,8,8));
        int n = 5;

        for (int i = 1; i < n; i++) {
            numbers.removeIf(p->p == Collections.max(numbers));
        }

        int fifthMax = Collections.max(numbers);

        System.out.println(fifthMax);

    }
}
