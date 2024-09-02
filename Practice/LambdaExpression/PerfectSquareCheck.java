package Practice.LambdaExpression;

import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to check if a given number is a perfect square.

public class PerfectSquareCheck {
    public static void main(String[] args) {
        // define a lambda expression for checking if a given number is a perfect square or not
        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        // check the numbers
        int num = 36;
        System.out.println("Is the " + num + " is a perfect square number?  -> " + isPerfectSquare.test(num));

        num = 10;
        System.out.println("Is the " + num + " is a perfect square number?  -> " + isPerfectSquare.test(num));

        num = 81;
        System.out.println("Is the " + num + " is a perfect square number?  -> " + isPerfectSquare.test(num));
    }
}
