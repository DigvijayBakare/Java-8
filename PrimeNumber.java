package FunctionalInterfaces;

import java.util.stream.IntStream;

public class PrimeNumber {
    private static boolean isPrime(int n) {             // traditional way
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean primeNum(int n) {         // use of lambda expression
        return n > 0 && IntStream.range(2, n).noneMatch(index -> n % index == 0);
    }

    public static void main(String[] args) {
        System.out.println("Is no. prime => " + isPrime(5));
    }
}
