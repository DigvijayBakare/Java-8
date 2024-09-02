package Practice.Stream;

// Write a program using Java 8 that converts a List to a Map.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class ListToMapExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1, "John"), new Person(2, "Alise"), new Person(3, "Bob"),
                new Person(4, "Eve"), new Person(5, "Naresh"), new Person(6, "Digvijay")
        );

        // convert list to map using key function
        Map<Integer, Person> map = personList.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
        System.out.println("Map of list" + map);
    }
}
