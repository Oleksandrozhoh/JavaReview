package week03;

public class DaysInAWeek {
    public static void main(String[] args) {

        int day = 9;
        String result = "";


        if (day >= 1 && day <= 7) {
            if (day == 1) {
                result = "monday";
            } else if (day == 2) {
                result = "tuesday";
            } else if (day == 3) {
                result = "wednesday";
            } else if (day == 4) {
                result = "thersday";
            } else if (day == 5) {
                result = "friday";
            } else if (day == 6) {
                result = "saturday";
            } else {
                result = "sunday";
            }
        } else {
            if (day < 1) {
                result = "Day number can't be less than 1";
            } else {
                result = "Day number can't be greater than 7";
            }
        }
        System.out.println(result);
    }
}
