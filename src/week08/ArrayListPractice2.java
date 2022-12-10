package week08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    /*
    Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
    ex:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
    output:
        ["Lan", "Ebrahim", "Farida"]
     */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        words.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length() - 1));

        System.out.println(words);

    }
}
