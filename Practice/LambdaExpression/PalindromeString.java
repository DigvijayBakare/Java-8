package Practice.LambdaExpression;

// Write a Java program to implement a lambda expression to check if a given string is a palindrome.

import java.util.function.Predicate;

public class PalindromeString {
    public static void main(String[] args) throws Exception {
        // define the palindrome check using lambda expression
        Predicate<String> isPalindrome = p -> {
            p = p.toLowerCase();
            String reversed = new StringBuilder(p).reverse().toString();
            return p.equals(reversed);
        };

        // declare and print the string and then check if it is palindrome or not
        String str1 = "Java";
        System.out.println("Is string "+str1+" palindrome: "+isPalindrome.test(str1));

        String str2 = "Madam";
        System.out.println("Is string "+str2+" palindrome: "+isPalindrome.test(str2));

        String str3 = "radar";
        System.out.println("Is string "+str3+" palindrome: "+isPalindrome.test(str3));
    }
}
