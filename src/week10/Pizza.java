package week10;

public class Pizza {

    private String size;
    private int numberOfCheeseTopings, numberOfPeperoniToppings;

    public static String shape = "circle";

    public static void displayTheShapeOfPizza(){
        System.out.println("Shape of pizza is: "+shape);
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid pizza size: " + size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopings() {
        return numberOfCheeseTopings;
    }

    public void setNumberOfCheeseTopings(int numberOfCheeseTopings) {
        if (numberOfCheeseTopings<=0){
            System.err.println("Number of cheese toppings can not be negative");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small")){
            if (numberOfCheeseTopings >3){
                System.err.println("Number of cheese toppings can not be more than 3 for small size pizza");
                System.exit(1);
            }
        }

        if (size.equalsIgnoreCase("medium")) {
            if (numberOfCheeseTopings > 4) {
                System.err.println("Number of cheese toppings can not be more than 4 for medium size pizza");
                System.exit(1);
            } else if (numberOfCheeseTopings > 5) {
                System.err.println("Number of cheese toppings can not be more than 5 for large size pizza");
                System.exit(1);
            }
        }

        this.numberOfCheeseTopings = numberOfCheeseTopings;
    }

    public int getNumberOfPeperoniToppings() {
        return numberOfPeperoniToppings;
    }

    public void setNumberOfPeperoniToppings(int numberOfPeperoniToppings) {

        if (size.equalsIgnoreCase("small")){
            if (numberOfPeperoniToppings>4){
                System.err.println("Max number of peperoni topping for small pizza is 4");
                System.exit(1);
            }
        } else if (size.equalsIgnoreCase("medium")){
            if (numberOfPeperoniToppings>5){
                System.err.println("Max number of peperoni topping for medium pizza is 5");
                System.exit(1);
            }else{
                if (numberOfPeperoniToppings>6){
                    System.err.println("Max number of peperoni topping for large pizza is 6");
                    System.exit(1);
                }
            }
        }
        this.numberOfPeperoniToppings = numberOfPeperoniToppings;
    }

    public Pizza(String size, int numberOfCheeseTopings, int numberOfPeperoniToppings) {
       setSize(size);
       setNumberOfCheeseTopings(numberOfCheeseTopings);
       setNumberOfPeperoniToppings(numberOfPeperoniToppings);
    }

    public double calcCost(){
        double totalPrice =0;

        if (size.equalsIgnoreCase("small")){
            totalPrice+=10;
        } else if (size.equalsIgnoreCase("small")) {
            totalPrice+=12;
        } else {
            totalPrice+=14;
        }

        totalPrice+= (numberOfCheeseTopings*1)+(numberOfPeperoniToppings*2);

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopings=" + numberOfCheeseTopings +
                ", numberOfPeperoniToppings=" + numberOfPeperoniToppings +
                ", totalPrice=" + calcCost() +
                '}';
    }

/*Pizza Task:
    Create class named CydeoStudent:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            1. size of the pizza can only be set to small, medium, large (case insensitive)
                            2. Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            3. Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)

                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: starts at $10
                        M: starts at $12
                        L: starts at $14

                        Per pepperoni topping: 2$
                        Per cheese topping: 1$*/
}
