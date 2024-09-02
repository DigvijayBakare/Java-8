package Practice.LambdaExpression;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;

// Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedCase.

public class StringUpperLowerCheck {
    public static void main(String[] args) {
        // declare and print the list of string
        List<String> list = Arrays.asList("Java", "JAVA", "java", "Program", "PROGRAM", "program");
//        List<String> list = Arrays.asList("JAVA", "PROGRAM", "LANGUAGE");
//        List<String> list = Arrays.asList("java", "program", "language");
        System.out.println("Original list: " + list);

        // check if the string is of all uppercase using lambda
        boolean isAllUpper = checkString(list, s -> s.equals(s.toUpperCase()), String:: toUpperCase);
        System.out.println("Is all uppercase? " + isAllUpper);

        // check if the string is of all lowerCase using lambda
        boolean isAllLower = checkString(list, s -> s.equals(s.toLowerCase()), String:: toLowerCase);
        System.out.println("Is all lowercase? " + isAllLower);

        // check if the string is of all mixedCase using lambda
        boolean isAllMixed = !isAllUpper && !isAllLower;
        System.out.println("Is all mixedCase? " + isAllMixed);
    }
    private static boolean checkString(List<String> list, Predicate<String> p, Function<String, String> convert) {
        String firstString = list.get(0);
        String convertedString = convert.apply(firstString);
        return list.stream().allMatch(s -> p.test(s));
    }
}
