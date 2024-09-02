package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// Write a Java program to remove all duplicate elements from a list using streams.

public class RemoveDuplicate {
    public static void main(String[] args) {
        // declare and print the list of integers containing duplicate elements
        List<Integer> list = Arrays.asList(1, 2, 9, 5, 7, 6, 4, 7, 3, 2, 1, 6, 4, 8, 8, 2, 9, 10, 5, 9, 7, 1);
        System.out.println("Original list: " + list);

        // remove duplicate elements and print the list
        List<Integer> unique = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("The list of unique integer elements in the list: " + unique);
    }
}
