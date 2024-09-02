package Practice.LambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

public class RemoveDuplicates {
    public static void main(String[] args) {
        // declare a list of integer values and print it
        List<Integer> list = Arrays.asList(1, 5, 6, 3, 2, 4, 5, 9, 8, 9, 1, 2, 6, 1, 9, 8, 7, 4, 5, 6, 3, 2, 1, 10);
        System.out.println("Original list: " + list);

        // remove the duplicates from the list, sort it and print it
        List<Integer> newList = new ArrayList<>();
        list.stream().distinct().sorted().forEach(newList::add);
        System.out.println("New list: " + newList);
    }
}
