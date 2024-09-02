package Streams;

import java.util.*;
import java.util.stream.Collectors;


public class SimpleStreamProgram {
    public static void main(String[] args) {
        // declare an arraylist and print it using foreach() method
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.forEach(System.out::println);
        System.out.println("Original number list: "+list);

        // even number list
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        // even number list
        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        // print both the even and odd list
        System.out.println("Even number list: "+even);
        System.out.println("Odd number list: "+odd);
    }
}
