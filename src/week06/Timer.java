package week06;

import java.util.Scanner;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        int timerTime = input.nextInt();

        for (int j = timerTime-1; j >= 0; j--) {
            for (int i = 59; i >= 0; i--) {
                System.out.println(j + " minutes " + i + " seconds");
                Thread.sleep(1000);
            }
        }

        System.out.println("----------------------------------");
        System.out.println("-----The break is over beach!-----");
        System.out.println("----------------------------------");

    }
}
