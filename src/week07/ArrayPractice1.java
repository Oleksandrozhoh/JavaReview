package week07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // by array litteral
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));

        // by new keyword:

        int[] array1 = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter " + (i+1) + "st number:");
            array1[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(array1));

    }
}
