package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

// Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

public class MinAndMaxValueInList {
    public static void main(String[] args) {
        // declare an integer list and print it
        List<Integer> list = Arrays.asList(9, 3, 1, 6, 7, 8, 4, 5, 2);
        System.out.println("Original list: " + list);

        // finding minimum and maximum value in the list
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("Minimum number: " + min.get() + "\nMaximum number: " + max.get());
    }
}
