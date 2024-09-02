package MethodReference;

import java.util.function.Function;

public class StaticMethods {
    public static void main(String[] args) {
        // calling parseInt() method using lambda
        Function<String, Integer> l = (String s) -> Integer.parseInt(s);
        System.out.println("Using lambda: "+ l.apply("12"));

        // calling parseInt() method using method reference
        Function<String, Integer> m = Integer :: parseInt;
        System.out.println("Using method reference: "+m.apply("55"));
    }
}
