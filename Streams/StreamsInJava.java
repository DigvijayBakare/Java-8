package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsInJava {
    public static void main(String[] args) {
//        IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7, 10}).filter((int i) -> i > 5).distinct().forEach(System.out::println);

        // Execution
        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        //Normal Execution
        names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

        //Parallel Execution
        names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

        // traversing a stream
        List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");
        Stream<String> stream = nameList.stream();
        stream.forEach(System.out::println);

//        stream.forEach(System.out::println);
        //Error : stream has already been operated upon or closed

         System.out.println(names);         // It will print the list as it is
    }
}
