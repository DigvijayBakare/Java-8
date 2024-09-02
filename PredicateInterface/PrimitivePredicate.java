package FunctionalInterfaces.PredicateInterface;

import java.util.function.*;

public class PrimitivePredicate {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30,40,45,50,60};

//        Predicate<Integer> p = pr -> pr%2 == 0;     // autoboxing and auto-unboxing will be performed no. if times

        IntPredicate ip = i -> i%2 == 0;

        for (int i : x) {
            if (ip.test(i)) System.out.print(i+" ");
        }
    }
}
