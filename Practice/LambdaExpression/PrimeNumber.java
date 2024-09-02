package Practice.LambdaExpression;

import java.util.function.Predicate;
import java.util.ArrayList;

// Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.

public class PrimeNumber {
    public static void main(String[] args) {
        // lambda expression
        Predicate<Integer> prime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // provide number for checking
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (prime.test(i)) {
                list.add(i);
            }
        }
        System.out.println("List of all prime numbers form 1-100: " + list);
    }
}
