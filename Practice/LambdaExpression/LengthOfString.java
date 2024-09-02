package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;

// Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.

public class LengthOfString {
    public static void main(String[] args) {
        // define and print the list of strings
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Orange", "Black", "Yellow", "White", "Geranium Lake");
        System.out.println("Original list: " + list);

        // define lambda expression for checking the longest and smallest length strings
        int maxLength = list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("The longest length: " + maxLength);
        int minLength = list.stream().mapToInt(String::length).min().orElse(0);
        System.out.println("The smallest length: " + minLength);
    }
}
