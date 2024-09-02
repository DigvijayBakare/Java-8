package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;

// Write a Java program to implement a lambda expression to find the average length of strings in a list.

public class AverageOfString {
    public static void main(String[] args) {
        // declare a list of string and print it
        List<String> list = Arrays.asList("Java", "program", "to", "implement", "lambda", "expression", "average", "length", "strings");
        System.out.println("Original string list: " + list);

        double average = averageLength(list);
        System.out.println("The average length of the given list: " + average);
    }

    private static double averageLength(List<String> l) {
        return l.stream().mapToInt(String::length).average().orElse(0);
    }
}
