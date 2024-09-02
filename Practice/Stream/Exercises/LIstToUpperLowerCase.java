package Practice.Stream.Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// Write a Java program to convert a list of strings to uppercase or lowercase using streams.

public class LIstToUpperLowerCase {
    public static void main(String[] args) {
        // create a list of string elements and print it
        List<String> list = Arrays.asList("Create", "a", "List", "Of", "String", "Elements", "And", "Print", "it");
        System.out.println("Original list: " + list);

        // convert the list of string to lower case and print it
        List<String> lowerCase = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("List of string in lower case: " + lowerCase);

        // convert the list of string to upper case and print it
        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("List of string in upper case: " + upperCase);
    }
}
