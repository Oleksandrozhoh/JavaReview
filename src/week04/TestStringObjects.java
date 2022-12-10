package week04;

import java.util.Scanner;

public class TestStringObjects {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = new String("java");  // created string with the new keyword  // heap memory

        String str2 = "Java";  // created string  by using string literal  // heap memory String pool

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println(str == str2);  // false , comparing 2 different objects
        System.out.println(str.equals(str2)); // true , comparing 2 string values/texts


    }
}

