package week03;

import java.util.Scanner; // - scanner class stored in the java.util package

public class _Scanner {
    public static void main(String[] args) {

        // Scanner - used to get the user input & read files (extract the data from files to our programm)

        Scanner      input           =        new Scanner         (System.in);  // - created object of a scanner
        //      scanner variable             scanner constructor  (  input function  );

        /*
        nextInt(): for int input
        nextDouble(): for double inputs

        next(): for String inputs ( till first space )
        nextLine(): for String inputs (whole line)
         */
        System.out.println("Enter number:");
         int number = input.nextInt(); // - integer data type user input assigned to a variable
        System.out.println(number);

        input.nextLine(); // - collecting scanners memory garbage (  since ".nextInt()" before the ".nextLine()"  )

        System.out.println("Enter char: ");
        char char1 = input.nextLine().charAt(0); // - wat to collect the char
        System.out.println(char1);

        System.out.println("Enter the string below:");
        String word = input.nextLine();
        System.out.println(word);

        input.close(); // - close the scanner after done with it, to stop the connection with the keybord, + save memory since scanner takes memory space as well


    }
}
