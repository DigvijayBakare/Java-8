package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

// Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

public class ListAscendingDescending {
    public static void main(String[] args) {
        // declare and print the list of string
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown", "Yellow", "Black", "Purple", "White");
        System.out.println("Original list: " + list);

        // Ascending and descending order list
        List<String> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("List in ascending order: " + ascendingOrder +
                "\nList in descending order: " + descendingOrder);
    }
}
