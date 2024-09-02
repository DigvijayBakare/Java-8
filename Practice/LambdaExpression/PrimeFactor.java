package Practice.LambdaExpression;

import java.util.stream.LongStream;

// Write a Java program to implement a lambda expression to find the largest prime factor of a given number.

public class PrimeFactor {
    public static void main(String[] args) {
        int n = 176;
        System.out.println("Number: " + n);

        long lPrimeFactor = largestPrimeFactor(n);
        System.out.println("Largest prime factor: " + lPrimeFactor);

        n = 256;
        System.out.println("The largest prime factor of " + n + " is "+ largestPrimeFactor(n));
    }

    private static long largestPrimeFactor(long n) {
        for (long i = (long) Math.sqrt(n); i >= 2; i--) {
            if (n % 2 == 0 && isPrime(i)) {
                return i;
            }
        }
        return n;
    }

    private static boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n)).allMatch(num -> n % num != 0);
    }
}
