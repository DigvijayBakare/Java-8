package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamCollectors {
    public static void streamToList() {
        // collect stream elements to a list
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Stream<Integer> streamList = list.stream();
        List<Integer> evenList = streamList.filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even number list: " + evenList);
    }

    public static void streamToArray() {
        // Collect Stream Elements to an Array
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Stream<Integer> streamList = list.stream();
        Integer[] evenArray = streamList.filter(n -> n % 2 == 0).toArray(Integer[] :: new);
        System.out.println("Even number array: " + Arrays.toString(evenArray));
    }

    public static void main(String[] args) {
        streamToList();
        streamToArray();
    }
}
