package LambdaExpression;
import java.util.function.Predicate;
public class lambdaevenodd {
	public static void main(String[] args) {
		  // Lambda expression to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Lambda expression to check if a number is odd
        Predicate<Integer> isOdd = number -> number % 2 != 0;

        // Test cases
        int num1 = 10;
        int num2 = 15;

        // Checking if numbers are even or odd
        System.out.println(num1 + " is even: " + isEven.test(num1));
        System.out.println(num2 + " is odd: " + isOdd.test(num2));

	}
}
