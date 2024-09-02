package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;

// Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.

public class MultiplicationAndSum {
    public static void main(String[] args) {
        // declare an integer list and print it
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("Original list: " + list);

        // getting sum and product of elements in the list
        int sum = list.stream().reduce(0, Integer::sum);
        int product = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println("The sum: " + sum + "\nThe product: " + product);
    }
}
