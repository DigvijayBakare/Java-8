package Practice.LambdaExpression;

import java.util.function.Function;

// Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.

public class IntToBinary {
    public static void main(String[] args) {
        // write lambda expression for converting integer to its corresponding binary representation
        Function<Integer, String> toBinary = Integer::toBinaryString;

        // check the binary by providing some numbers
        int i = 10;
        String binary = toBinary.apply(i);
        System.out.println("Binary representation of " + i + " is " + binary);

        i = 25;
        System.out.println("Binary representation of " + i + " is " + toBinary.apply(i));
    }
}
