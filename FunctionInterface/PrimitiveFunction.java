package FunctionalInterfaces.FunctionInterface;

import java.util.function.*;

public class PrimitiveFunction {
    public static void main(String[] args) {
        // auto-boxing and auto-unboxing (performance will be reduced)
        Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(4));

        // primitive version of function
        IntFunction fi = i -> i*i*i;
        System.out.println(fi.apply(5));

        // 
    }
}
