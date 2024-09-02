package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.

public class ContainsWord {
    public static void main(String[] args) {
        // define a list and print it
        List<String> list = Arrays.asList("Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun");
        System.out.println("Original list: " + list);

        // declare some words to find
        String word = "Mon";


        // define a lambda for checking the specific word in a list
        String finalWord = word;
        Predicate<String> isAvailable = p -> p.equals(finalWord);
        boolean flag = list.stream().anyMatch(isAvailable);

        // check for the availability in the list
        System.out.println("Is the word " + word + " present in the given list: " + flag);

        word = "Nil";
        String finalWord1 = word;
        Predicate<String> isAvailable1 = p -> p.equals(finalWord1);
        boolean flag1 = list.stream().anyMatch(isAvailable1);
        System.out.println("Is the word " + word + " present in the given list: " + flag1);
    }
}
