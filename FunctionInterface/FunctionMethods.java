package FunctionalInterfaces.FunctionInterface;

import java.util.function.Function;

public class FunctionMethods {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = i -> 2*i;
        Function<Integer,Integer> f2 = i -> i*i*i;
        Function<Integer,Integer> f3 = Function.identity();
        System.out.println(f1.apply(4));        // 8
        System.out.println(f2.apply(5));        // 125     => perform the specified function and then return the result
        System.out.println(f1.andThen(f2).apply(10));   // 8000 => first perform f1 function and then f2 then return the result
        System.out.println(f1.compose(f2).apply(2));    // 16  => first perform f2 function and then f1 then return the result

        System.out.println(f3.apply(100));          // 100  => returns the value as it is // identity function
    }
}
