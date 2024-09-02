package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

// Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.

public class SecondLargeAndSmall {
    public static void main(String[] args) {
        // declare and print a list of integers
        List<Integer> list = Arrays.asList(1, 9, 6, 49, 22, 38, 34, 54, 89, 36, 0);
        System.out.println("Original list: " + list);

        // find second largest and smallest element and print them
        int secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The second largest element in the given list: " + secondLargest);
        int secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println("The second smallest element in the given list: " + secondSmallest);
    }
}
