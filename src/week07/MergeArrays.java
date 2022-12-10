package week07;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"E", "F", "G", "K", "H"};

        String[] newStr = new String[str1.length+str2.length];

        for (int i = 0; i < newStr.length; i++) {
            if(i<str1.length){
                newStr[i] = str1[i];
            }else{
                newStr[i] = str2[i-str1.length];
            }
        }
        
        System.out.println(Arrays.toString(newStr));
    }
}
