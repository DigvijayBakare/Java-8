package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

// Write a Java program to find the maximum and minimum values in a list of integers using streams.
// Write a Java program to find the second smallest and largest elements in a list of integers using streams.

public class MaxAndMinValue {
    public static void main(String[] args) {
        // declare and print integer list
        List<Integer> list = Arrays.asList(9, 2, 5, 63, 1, 7, 9, 72, 7, 9, 0, 46, 8, 6, 5, 2, 2, 6, 5, -8, -5, -52, -2);
        System.out.println("Original list: " + list);

        // finding minimum and maximum number in the list using stream
        int min = list.stream().min(Comparator.naturalOrder()).orElse(null);

        // in place of Comparator we can also use Integer::compare
        int max = list.stream().max(Integer::compare).orElse(null);
        System.out.println("The minimum number in the list is " + min + " and the maximum number is " + max);

        // now finding second smallest and largest element using stream
        int secMin = list.stream().distinct().sorted().skip(1).findFirst().get();
        int secMax = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        // Comparator.reverseOrder() => can be replaced with (a, b) -> Integer.compare(b, a)
        System.out.println("The second minimum number in the list is " + secMin + " and the second maximum number is " + secMax);
    }
}
