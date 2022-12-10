package week04;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String str = "Cydeo";

        char char1 = str.charAt(1);

        int length = str.length();

        int indexOf1 = str.indexOf('e'); // can pass character as char
        int indexOf11 = str.indexOf("e"); // can pass character as string

        System.out.println("char1 = " + char1);
        System.out.println("length = " + length);
        System.out.println("indexOf1 = " + indexOf1);

        String s1 = "BATCH 28";

        String s2 = s1. toLowerCase();

        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------");


        String a2 = "I live in Chicago, I love Chicago";

        a2 = a2.replaceFirst("Chicago","New York");

        System.out.println(a2);

        System.out.println("-----------------------------");

        String z1 = "Batch 28 students";

        z1 = z1.substring(0,z1.indexOf("8")+1);

        System.out.println(z1);


        System.out.println("-----------------------------");
        String name = "OlEksAnDr";
        name = name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);

        System.out.println("name = " + name);

        System.out.println("-----------------------------");
        String string1 = "JAva";
        String string2 = "jaVA";

        System.out.println(string1.equals((string2))); //false since the casing is different
        System.out.println(string1.equalsIgnoreCase(string2)); // true since we ignore casing now

        System.out.println("-----------------------------");
        String string4 = "Today we are going to have Java and Soft Skill classes";
        boolean hasCelenium = string4.contains("Celenium");
        boolean hasJava = string4.toLowerCase().contains("java");

        System.out.println("hasCelenium = " + hasCelenium); // false
        System.out.println("hasJava = " + hasJava); // true since we intentionaly ignored casing and the string has word java in it





    }
}
