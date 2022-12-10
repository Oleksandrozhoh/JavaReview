package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task04 {
    /*
    4. Write a program that can return the unique characters from a string

    DO NOT use:
            for loop, for each loop, while loop, do while loop
     */

    public static void main(String[] args) {

        String str = "asdgl;knewt'galsmg";


        String[] strArray = str.split("");


        ArrayList <String> strList = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(strList);

        strList.toArray(new String[0]);



        strList.removeIf(p-> Collections.frequency(strList,p) > 1);

        System.out.println(strList);
        System.out.println(Arrays.toString(strArray));


    }
}
