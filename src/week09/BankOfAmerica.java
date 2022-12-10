package week09;

import week09.ScrumTeam.Developer;
import week09.ScrumTeam.Tester;

import java.time.LocalDate;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Alex", "12421","SDET",'M', LocalDate.of(1992,10,9),100_000);
        System.out.println(tester1);

        Tester tester2 = new Tester("Ali");
        System.out.println(tester2);

        System.out.println("Rapper Snoop Dog is smoke testing");


        Developer dev1 = new Developer("Greg", "32532","Developer",'M', LocalDate.of(1992,10,9),180_000);
        System.out.println(dev1);

        System.out.println("-------------------------------------");
        dev1.fixingBug();
        tester1.dailyStandUp();
        tester2.creatingTicket();



    }
}
