package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.function.*;

// Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

public class SquareSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEven = list.stream().filter(a -> a % 2 == 0).mapToInt(n -> n * n).sum();
        System.out.println("The sum of square of all even numbers in the list: " + sumOfEven);

        int sumOfOdd = list.stream().filter(a -> a % 2 != 0).mapToInt(n -> n * n).sum();
        System.out.println("The sum of square of all odd numbers in the list: " + sumOfOdd);
    }
}
