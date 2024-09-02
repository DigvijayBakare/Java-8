package FunctionalInterfaces.FunctionInterface;

import java.util.function.Function;

public class FunctionFunctionalInterfaceTesting {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(5));
    }
}
