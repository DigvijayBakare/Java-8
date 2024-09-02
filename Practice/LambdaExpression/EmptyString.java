package Practice.LambdaExpression;

import java.util.function.*;

//  Write a Java program to implement a lambda expression to check if a given string is empty.

public class EmptyString {
    public static void main(String[] args) {
        // Using predicate functional interface for checking the string is empty or not
        Predicate<String> str = string -> string.isEmpty();

        String str1 = "";
        System.out.println("String str1: "+str1+"\nIs the string str1 empty: "+str.test(str1));

        String str2 = "Java Programming";
        System.out.println("\nString str2: "+str2+"\nIs the string str2 empty: "+str.test(str2));
    }
}
