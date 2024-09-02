package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.function.IntPredicate;

// Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

public class EvenOddNumbers {
    public static void main(String[] args) {
        // declare and print a list of integer numbers
        List<Integer> numList = Arrays.asList(9, 5, 10, 6, 4, 3, 7, 12, 1, 2, 8, 11);
        System.out.println("Original list: "+numList);

        // filter out all the even numbers in the list
        IntPredicate even = i -> i%2 == 0;
        System.out.print("Even numbers in the list: ");
        for (int n : numList) {
            if (even.test(n)) System.out.print(n + " ");
        }

        // filter out all the even numbers in the list
        IntPredicate odd = i -> i%2 != 0;
        System.out.print("\nOdd numbers in the list: ");
        for (int n : numList) {
            if (odd.test(n)) System.out.print(n + " ");
        }
        System.out.println();
    }
}
