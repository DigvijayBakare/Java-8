package Streams;

import java.util.*;
import java.util.stream.*;

public class CreatingAStream {
    public static void main(String[] args) {
        // using Stream.of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream.forEach(p -> System.out.print(p + " "));
        System.out.println();

        // using Stream.of(array)
        Stream<Integer> streamArray = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        streamArray.forEach(p -> System.out.print(p + " "));
        System.out.println();

        // using list.stream()
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Stream<Integer> streamList = list.stream();
        streamList.forEach(p -> System.out.print(p + " "));
        System.out.println();

        // using Stream.generate() or Stream.iterate()
        Stream<Integer> randomArray = Stream.generate(() -> (new Random()).nextInt());
        randomArray.limit(20).forEach(System.out::println);

        // using Stream of String chars or tokens
        IntStream intStream = "123456_abcdefg".chars();
        intStream.forEach(p -> System.out.print(p + " "));
        System.out.println();

        //OR
        Stream<String> streamString = Stream.of("A$B$C".split("\\$"));
        streamString.forEach(p -> System.out.print(p + " "));
    }
}
