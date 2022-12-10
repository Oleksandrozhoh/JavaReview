package week05;

public class MethodPractice_Void {
    public static void main(String[] args) {

        calculate(3, 5, '*');


    }

    public static void calculate(double num1, double num2, char mathOperator) {

        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.err.println("Denominator cant be 0!");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.err.println("Invalid math operator!");
        }
    }
}
