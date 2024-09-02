package Practice.Examples;

import java.util.ArrayList;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("David", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alise", 35));
        people.add(new Person("Carel", 18));
        people.add(new Person("John", 21));

        // print the original list
        System.out.println("Original list: " + people);

        // using comparing() with lambda expression
        Comparator<Person> ageComparator = Comparator.comparing(person -> person.getAge());
        people.sort(ageComparator);
        System.out.println("Sorted by age: " + people);


        // using comparing() with method reference
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        people.sort(nameComparator);
        System.out.println("Sorted by name: " + people);

        // reversed sorting
        Comparator<Person> reversedAgeComparator = Comparator.comparing(Person :: getAge).reversed();
        people.sort(reversedAgeComparator);
        System.out.println("Sorted by reversed age: " + people);

        Comparator<Person> reversedNameComparator = Comparator.comparing(Person::getName).reversed();
        people.sort(reversedNameComparator);
        System.out.println("Sorted by reversed name: " + people);
    }
}
