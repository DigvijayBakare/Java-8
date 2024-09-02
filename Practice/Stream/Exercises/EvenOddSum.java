package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;

// Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

public class EvenOddSum {
    public static void main(String[] args) {
        // declare and print the list of integer
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list: " + list);

        // sum of even and odd numbers in the list
        int evenSum = list.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = list.stream().filter(n -> n%2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("The sum of even numbers in the list is " + evenSum +
                "\nThe sum of odd numbers in the list is " + oddSum);
    }
}
