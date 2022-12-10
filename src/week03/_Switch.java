package week03;

public class _Switch {
    public static void main(String[] args) {

        // The performance of SWITCH is much faster than IF statement
        // If we need to execute based on the matching value, than the switch statement is the best!

        /*
        switch(expression) {   - expression must be evaluated to a single value (long,float,double, booleans are not allowed)
            case caseValue:    - case value must be unic  and must match with expression dataType
                 statementA;
                 break;        - break used to terminate the switch

            case caseValue2:
                 statementB;
                 break;

            default:           - default block used to execute the statements if none of the case blocks values matched the expression
                 statementC;
                               - order of the blocks doesn't matter, case blocks can be empty....
         */

        // Week day task with switch:
        int day = -11;
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                if (day < 1) {
                    dayName = "Day number can't be less than 1";
                } else {
                    dayName = "Day number can't be greater than 7";
                }
        }
        System.out.println(dayName);
    }
}
