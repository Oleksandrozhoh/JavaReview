package week07;

public class MatchingElements {
    public static void main(String[] args) {

        String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
        String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};


        for (String eachArr1 : arr1) {
        for (String eachArr2 : arr2) {
            if(eachArr2.equals(eachArr1)) {
                System.out.println(eachArr1);
            }
        }
        }


    }
}
