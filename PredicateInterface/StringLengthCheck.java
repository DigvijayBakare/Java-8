package FunctionalInterfaces.PredicateInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class StringLengthCheck {
    public static void main(String[] args) {
        String[] str = {"Nari","Veerat","Sam","Angad","Rushi"};
        System.out.println("Original array: "+ Arrays.toString(str));
        Predicate<String> p = s -> s.length()>=5;
        for (String se : str) {
            if (p.test(se)) {
                System.out.println(se);
            }
        }
    }
}
