package week08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

        System.out.println(words);

        words.get(1).charAt(0);

        System.out.println("--------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        numbers.removeIf(p->p<3);
        System.out.println(numbers);

    }
}
