package week06;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            System.out.println("Please enter an even number:");
            int number = input.nextInt();


            while (number%2!=0) {
                System.err.println(number + " is not an even mumber, please re-enter:");
                number = input.nextInt();
        }

        System.out.println("Thank you, have a great day!");
    }
}
