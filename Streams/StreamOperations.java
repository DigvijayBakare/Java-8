package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    public static void main(String[] args) {
        // create a list of name
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Anant");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // filter operation
        memberNames.stream().filter(s -> s.startsWith("A")).forEach(p -> System.out.print(p + "  "));
        System.out.println();

        // map operation
        memberNames.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(p -> System.out.print(p + "  "));
        System.out.println();

        // sorted operation
//        memberNames.stream().sorted().map(String :: toUpperCase).forEach(p -> System.out.print(p+"  "));
        Comparator<String> c;
        memberNames.stream().sorted(c = (a, b) -> b.compareTo(a)).forEach(p -> System.out.print(p + "  "));
        System.out.println();

        // match operation
        System.out.println("Is there any string starting with A: " + memberNames.stream().anyMatch(s -> s.startsWith("A")));
        System.out.println("Is all string starting with A: " + memberNames.stream().allMatch(s -> s.startsWith("A")));
        System.out.println("Is none string starting with A: " + memberNames.stream().noneMatch(s -> s.startsWith("A")));

        // count operation
        System.out.println("Number if names starting with letter A: " + memberNames.stream().filter(s -> s.startsWith("A")).count());

        // reduce operation
        Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + " # " + s2);
        reduced.ifPresent(System.out::println);

        // find first operation
        System.out.println("What is the first name starting with letter A: " + memberNames.stream().filter(s -> s.startsWith("A")).findFirst().get());
        System.out.println("Any name starting with letter A: " + memberNames.stream().filter(s -> s.startsWith("A")).findAny().get());

        // parallel stream
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.parallelStream();
        Integer[] even = stream.filter(n -> n % 2 == 0).toArray(Integer[]::new);
        System.out.println("New Integer array: " + Arrays.toString(even));

        // flat-map operation
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8)
        );
        System.out.println("Original list before flattening: " + listOfLists);
        List<Integer> flatmapList = listOfLists.stream().flatMap(newList -> newList.stream()).collect(Collectors.toList());
        System.out.println("Flattened list: " + flatmapList);

        // merging arrays into single list
        String[][] dataArray = new String[][]{{"a", "b"},
                {"c", "d"}, {"e", "f"}, {"g", "h"}};


        List<String> listOfAllChars = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println("List of characters: " + listOfAllChars);


        // peek method
        List<Integer> peekList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newList = peekList.stream().peek(System.out::println).collect(Collectors.toList());
        // without terminal operation it will not produce any output
        System.out.println("Peek List: " + newList);

        // distinct method
        Collection<String> initial = Arrays.asList("A", "B", "C", "A", "B", "C", "D", "E", "F", "M", "F");
        System.out.println("original list: "+initial);
        List<String> distinctChar = initial.stream().distinct().collect(Collectors.toList());
        System.out.println("List of distinct characters: " + distinctChar);

        // similarly for integer list
        Collection<Integer> intList = Arrays.asList(1,6,2,3,4,5,2,1,3,6,4,2,3,4,9,8,7,10);
        System.out.println("Original list: "+intList);
        List<Integer> distinctNum = intList.stream().distinct().collect(Collectors.toList());
        System.out.println("List of distinct numbers: " + distinctNum);

        // skip method
        Stream<Integer> evenInfinite = Stream.iterate(0, n -> n+2);
        List<Integer> skipList = evenInfinite.skip(5).limit(10).collect(Collectors.toList());
        System.out.println("Even number list using skip method: "+skipList);

        // minimum operation
        Comparator<Integer> comp;
        System.out.println("Minimum number of list: "+distinctNum.stream().min(comp = Integer::compareTo).get());
        System.out.println("Maximum number of list: "+distinctNum.stream().max(comp = Integer::compareTo).get());
    }
}
