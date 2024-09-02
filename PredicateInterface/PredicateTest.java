package FunctionalInterfaces.PredicateInterface;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        // create a list of string objects
        List<String> l = Arrays.asList("Java","Geeks","Program","Shiv","Predicate");

        // create a predicate object and use lambda expression for string type
        Predicate<String> p = (s) -> s.startsWith("P");         // given in example
//        Predicate<String> p = (s) -> s.length() > 4;          // tried for self understanding

        for (String s : l) {
            if (p.test(s)) System.out.println(s);
        }
    }
}
