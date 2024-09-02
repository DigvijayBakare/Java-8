package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;

// Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

public class SortingOfString {
    public static void main(String[] args) {
        // declare and print a list of string elements
        List<String> stringList = Arrays.asList("Mango","Apple","Dates","Papaya","Orange","HoneyDew Melons");
        System.out.println("Original list: "+stringList);

        // sorting the list in alphabetical order
        stringList.sort((str1,str2) -> str1.compareTo(str2));
        System.out.println("List after sorting: "+stringList);
    }
}
