package week06;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "kkzdatlksssss";

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if(!newStr.contains(""+str.charAt(i))){
                newStr += str.charAt(i);
            }

        }
        System.out.println("str = " + str);
        System.out.println("newStr = " + newStr);
    }
}
