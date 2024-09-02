package Practice.Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumbersInAList {
    public static void evenNumber() {
        /* Write a program to find even number from list using Java 8. */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List: " + numbers);

        // even numbers
        List<Integer> evenNum = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("List of even numbers: " + evenNum);

        /* How to find sum of elements present in array using java 8. */
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of these even numbers is " + sum);
    }

    public static void uniqueElements() {
        /* How to find unique elements from list using Java 8? with sorting order */
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 8, 5, 6, 4, 2, 6, 2, 7, 7, 4, 3, 8, 9, 9, 10);
        System.out.println("Original list: " + numbers);

        // find unique elements
        List<Integer> uniqueNum = numbers.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Unique number list: " + uniqueNum);
    }

    public static void firstChar() {
        /* Write a program using Java 8 to print first character of given String. */
        String name = "Java";
        System.out.println("Full word: " + name);

        char fChar = name.chars().mapToObj(c -> (char) c).findFirst().get();
        System.out.println("First character of given word: " + fChar);
    }

    public static void duplicateElements() {
        /* Write a program to find duplicate elements from list using Java 8. */
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 8, 5, 6, 4, 2, 6, 2, 7, 7, 4, 3, 8, 9, 9, 10);
        System.out.println("Original list: " + numbers);

        // duplicate elements in the given list
        HashSet<Integer> set = new HashSet<>();
        numbers.stream().filter(n -> !set.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void stringToMap() {
        /* How to convert String to Map object using Java 8 where Character should be Map’s key and number of repetition will be Map’s value? */
        String s = "Apple";
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }

    public static void main(String[] args) {
//        evenNumber();
//        uniqueElements();
//        firstChar();
//        duplicateElements();
        stringToMap();
    }
}
