package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Write a Java program to count the number of strings in a list that start with a specific letter using streams.

public class NoOfCount {
    public static void main(String[] args) {
        // declare and print the list of string elements
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original list: " + list);

        // count the number of string starting with same char
        long count = list.stream().filter(s -> s.startsWith("B")).count();
        System.out.println("The string with starting letter B appeared " + count + " times in the list");

        // next
        long count1 = list.stream().filter(s -> s.startsWith("G")).count();
        System.out.println("The string with starting letter B appeared " + count1 + " times in the list");
    }
}
