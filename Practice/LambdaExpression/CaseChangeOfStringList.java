package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;

// Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

public class CaseChangeOfStringList {
    public static void main(String[] args) {
        // declare a list of string and print it
        List<String> stringList = Arrays.asList("Red","Blue","Green","Black","Yellow","White");
        System.out.println("Original string list: ");
        for (String str : stringList) {
            System.out.print(str+", ");
        }

        // Converting all the strings in the list to lowercase and print them
        stringList.replaceAll(str -> str.toLowerCase());
        System.out.println("\n\nLowercase string list: ");
        for (String str : stringList) {
            System.out.print(str+", ");
        }

        // Converting all the strings in the string list to uppercase and print them
        stringList.replaceAll(str -> str.toUpperCase());
        System.out.println("\n\nUppercase string list: ");
        for (String str : stringList) {
            System.out.print(str+", ");
        }
        System.out.println();
    }
}
