package Practice.LambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.IntStream;

// Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.

public class SumOfPrimeNum {
    private static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        /*Predicate<Integer> prime = p -> {
            if (p <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(p); i++) {
                if (p % i == 0) {
                    return false;
                }
            }
            return true;
        };*/

//        List<Integer> numbers = new ArrayList<>();
//        int sum = 0;
        /*for (int i = 0; i <= 100; i++) {
            if (prime.test(i)) {
                sum += i;
//                numbers.add(i);
            }
        }*/
//        System.out.println("The sum of all prime numbers from 1 to 100: " + sum);
//        System.out.println(numbers);

        // or we can use
        int sumOfPrime = IntStream.rangeClosed(1, 100).filter(SumOfPrimeNum::prime).sum();
        System.out.println("The sum of all prime numbers from 1 to 100: " + sumOfPrime);
    }
}
