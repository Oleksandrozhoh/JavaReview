package week07;

import java.util.Arrays;

public class MergeArrays2 {
    public static void main(String[] args) {

        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"E", "F", "G", "K", "H"};

        String[] newStr = new String[str1.length+str2.length];


        int k = 0;
        for (String each : str1) {
            newStr[k++]=each;
        }
        for (String each : str2) {
            newStr[k++]=each;
        }

        System.out.println(Arrays.toString(newStr));


    }
}
