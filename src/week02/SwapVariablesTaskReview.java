package week02;

public class SwapVariablesTaskReview {
    public static void main(String[] args) {

        // -----------------with temporary variable--------------------
        int x = 100;
        int y = 200;

        int z = x; // creating a third variable to store the initial value of x
        x = y; // x value will be 200, x will have the value of y and lost its original value
        y=z; // y value will be 100, y will get the original x value that we stored into the z variable

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // -----------------without temporary variable--------------------

        int q = 100;
        int w = 250;

        q += w; // q are going to be equal to the sum of original q and w
        // q is increased by w (addition and assigning short hand operator articulation)
        w = q-w; // from the sum of original q and w we subtract the original w to store the original value of q in the variable w
        q -= w; // q will be 250; the original value of w
        // q is decreased by w  (subtraction and assigning short hand operator articulation)

        System.out.println("q = " + q);
        System.out.println("w = " + w);







    }
}
