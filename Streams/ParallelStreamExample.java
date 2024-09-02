package Streams;

import java.util.List;
import java.util.ArrayList;


public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        // normal execution
        names.stream().filter(s -> s.length() > 5).skip(1).forEach(System.out::println);

        // parallel execution
        names.parallelStream().filter(s -> s.length() > 5).skip(1).forEach(System.out::println);

        // peeking
        names.stream().filter(s -> s.length() > 5).peek(e -> System.out.println("Filtered name: "+e)).
                map(String::toUpperCase).peek(e -> System.out.println("Mapped name: "+e)).toArray();
    }
}
