package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;

// Write a Java program to calculate the average of a list of integers using streams.

public class AverageOfList {
    public static void main(String[] args) {
        // create a list of integers and print it
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list: " + list);

        // add all the list elements and get its average
        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("The average of elements in the list: " + average);
    }
}
