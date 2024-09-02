package Practice.LambdaExpression;

import java.util.function.LongUnaryOperator;

// Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.

public class FactorialOfNum {
    public static void main(String[] args) {
        // lambda expression
        LongUnaryOperator fact = n -> {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // input value and print the result
        long n = 5;
        long factResult = fact.applyAsLong(n);
        System.out.println("Factorial of " + n + " is " + factResult);
    }
}
