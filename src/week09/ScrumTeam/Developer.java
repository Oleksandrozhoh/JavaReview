package week09.ScrumTeam;

import java.time.LocalDate;

        /*
        2. create a class called Developer
        Attributes:
        name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

        Add a constructor that can set all the fields

        Actions:
        coding(), unitTesting(), fixingBug(), toString()
        */

public class Developer {

    public String name, jobTitle;
    public String employeeID;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public double salary;
    public static boolean hasProgrammingSkill = true;


    public Developer(String name, String employeeID, String jobTitle, char gender, LocalDate dateOfBirth, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public  void coding(){
        System.out.println(name+" Developer is coding...");
    }

    public void unitTesting(){
        System.out.println(name+" Developer is performing unit testing...");
    }

    public void fixingBug(){
        System.out.println(name+" Developer is fixing a bug...");
    }

    public String toString() {
        return "Developer{" +
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
