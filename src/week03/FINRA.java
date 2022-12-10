package week03;

public class FINRA {
    public static void main(String[] args) {

        int number = 17;
        String result ="";

        if (number > 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                result += "FINRA";
            } else if (number % 3 == 0) {
                result += "FIN";
            } else if (number % 5 == 0) {
                result += "RA";
            } else {
                result += number;
            }
        } else {
            System.err.println("enter the possitive number");
        }
        System.out.println(result);
    }
}
