package week09.ScrumTeam;

import java.time.LocalDate;

public class AppleInc {
    public static void main(String[] args) {

        ScrumTeam scrumTeam = new ScrumTeam("Iuliia Tsygankova", "Hamid Alakbarov","Priscilla Meloni",10);

        Tester [] myGroupTesters = new Tester[5];

        myGroupTesters[0] = new Tester("Abdellatif Zouliga", "123456","SDET",'M', LocalDate.of(1995,10,8),100_000);
        myGroupTesters[1] = new Tester("Dana Klokov", "123436456","SDET",'F', LocalDate.of(1994,9,1),110_000);
        myGroupTesters[2] = new Tester("Oleksandr Ozhoh", "12323536456","SDET",'M', LocalDate.of(1992,1,2),130_000);
        myGroupTesters[3] = new Tester("Maryana Sanotska", "123432656","SDET",'F', LocalDate.of(1996,2,1),105_000);
        myGroupTesters[4] = new Tester("Serhan Alpaydin", "123423556","SDET",'M', LocalDate.of(1993,11,18),100_000);

        scrumTeam.addTesters(myGroupTesters);


        Developer [] myGroupDevelopers = { // Creating Dev team by Array litteral
                new Developer("Dauren Khudaibergenov", "12342356","Developer",'M', LocalDate.of(1991,12,8),150_000),
                new Developer("Muhtar Muhtarovich", "2144214","Junior Developer",'M', LocalDate.of(1990,3,22),90_000),
                new Developer("Muhtar Muhtarovich", "2144214","Junior Developer",'M', LocalDate.of(1990,3,22),90_000),
                new Developer("Artyom Ogay", "1236","Developer",'M', LocalDate.of(1996,9,12),105_000),
                new Developer("Lena Gagliardi", "12323532456","Developer",'F', LocalDate.of(1995,11,9),160_000)
        };

        scrumTeam.addDevelopers(myGroupDevelopers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------");

        for (Tester eachTester : scrumTeam.testers) {
            System.out.println(eachTester.name+" : "+eachTester.jobTitle);
        }

        for (Developer eachDeveloper : scrumTeam.developers) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.jobTitle);
        }

        System.out.println("----------------------------------");

        scrumTeam.removeDeveloper("12342356");
        scrumTeam.removeDeveloper("2144214");
        scrumTeam.removeDeveloper("123455236");
        scrumTeam.removeDeveloper("1236");

        scrumTeam.removeTester("123456");
        scrumTeam.removeTester("123436456");
        scrumTeam.removeTester("12323536456");
        scrumTeam.removeTester("123432656");
        System.out.println(scrumTeam);

        System.out.println("----------------------------------");

        for (Tester eachTester : scrumTeam.testers) {
            System.out.println(eachTester.name+" : "+eachTester.jobTitle);
        }

        for (Developer eachDeveloper : scrumTeam.developers) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.jobTitle);
        }



    }
}
