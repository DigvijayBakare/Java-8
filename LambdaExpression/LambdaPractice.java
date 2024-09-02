package LambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.DoubleFunction;

public class LambdaPractice {
    static int x = 10;
    public static void main(String[] args) {
        Runnable hi = () -> System.out.println("Hi");
        int y = 20;
        BiConsumer<String, String> stringStringBiConsumer = (String s1, String s2) -> {
            System.out.println(s1 + " " + s2);
        };

        DoubleFunction<Double> doubleDoubleFunction = (double d) -> d;

    }
}
