import static java.lang.Math.PI;

public class Main {
    static final double caloriesInSquareSmOfPizza = 10;

    static double calculateArea(double diameter) {
        double radius = diameter / 2;
        return Math.pow(radius, 2) * PI;
    }

    static double calculatePizzaCalories(double diameter) {
        double res = calculateArea(diameter);
        return res * caloriesInSquareSmOfPizza;
    }

    static void printResult(String calories, double amountCalories) {
        System.out.println(calories + amountCalories);
    }

    public static void main(String[] args) {

        double firstPizza = calculatePizzaCalories(20.0);
        double secondPizza = calculatePizzaCalories(25.0);

        printResult("First Pizza : ", firstPizza);
        printResult("Second Pizza : ", secondPizza);
        printResult("Pizza calories difference : ", secondPizza - firstPizza);
    }
}
