package week09.ScrumTeam;

import java.time.LocalDate;

/*
        1. create a class called Tester
        Attributes:
        name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

        Add a constructor that can set all the fields

        Actions:
        smokeTesting(),  creatingTicket(), dailyStandUp() toString()
*/

public class Tester {
    public String name, jobTitle;
    public String employeeID;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public double salary;


    //Constructor overloaded 6 times for 6 parameters:
    public Tester(String name) {
        this.name = name;
    }
    public Tester(String name, String employeeID) {
        this(name);
        this.employeeID = employeeID;
    }
    public Tester(String name, String employeeID, String jobTitle) {
        this(name,employeeID);
        this.jobTitle = jobTitle;
    }
    public Tester(String name, String employeeID, String jobTitle, char gender) {
        this(name, employeeID, jobTitle);
        this.gender = gender;
    }
    public Tester(String name, String employeeID, String jobTitle, char gender, LocalDate dateOfBirth) {
        this(name, employeeID, jobTitle, gender);
        this.dateOfBirth = dateOfBirth;
    }
    public Tester(String name, String employeeID, String jobTitle, char gender, LocalDate dateOfBirth, double salary) {
        this(name,employeeID);
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    // static tester methods:
    public  void smokeTesting(){
        System.out.println(name+" performing smoke testing...");
    }
    public  void creatingTicket(){
        System.out.println(name+" creating a ticket...");
    }
    public  void dailyStandUp(){
        System.out.println(name+" attending daily standUp meeting...");
    }

    // to string method to print the Tester objects:
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
