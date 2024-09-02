package FunctionalInterfaces.PredicateInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class NumberChecking {
    public static void main(String[] args) {
        int[] a = {0,10,15,20,25,30,35,40};
//        int[] a = {8,9,2,5,4,6,3,7,1,10};
        System.out.println(Arrays.toString(a));

        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>5;

        // use all .add(), .or , .negate() methods
        System.out.print("Even numbers greater than 5: ");
        for (Integer s : a) {
            if (p1.and(p2).test(s)) {
                System.out.print(s+" ");
            }
        }
        System.out.print("\nEven number: ");
        for (Integer s : a) {
            if (p1.or(p2).test(s)) {
                System.out.print(s+" ");
            }
        }
        System.out.print("\nNot even number: ");
        for (Integer s : a) {
            if (p1.negate().test(s)) {
                System.out.print(s+" ");
            }
        }
        System.out.println();
    }
}
