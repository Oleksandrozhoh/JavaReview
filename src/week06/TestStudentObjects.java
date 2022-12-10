package week06;

public class TestStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();

        student1.setInfo("Alex", "Java", "Chicago Group", 30, 28, 'M', true, true);

        System.out.println(student1);

        student1.study();




    }
}
