package Practice.LambdaExpression;

import java.util.function.BiFunction;

// Write a Java program to implement a lambda expression to concatenate two strings.

public class StringConcatenation {
    public static void main(String[] args) {
        // declare two strings and print them
        String str1 = "Java";
        String str2 = " Programming";
        System.out.println("str1 = " + str1 + "\t\tstr2 = " + str2);

        // lambda expression
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        System.out.println("Result: " + concatenate.apply(str1, str2));
    }
}
