package Practice.LambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.

public class SortingOfAttributes {
    public static void main(String[] args) {
        // create a list studentSort class and add new students in it
        List<StudentSort> student = new ArrayList<>();
        student.add(new StudentSort("Adriana Jamie", 15));
        student.add(new StudentSort("Felix Uisdean", 15));
        student.add(new StudentSort("Conceicao Palmira", 14));
        student.add(new StudentSort("Jair Camila", 14));
        student.add(new StudentSort("Micaela Rosana", 15));

        // print the information of the students
        System.out.println("List of student before sorting: ");
        for (StudentSort before : student) {
            System.out.println(before.getName() + " - " + before.getAge());
        }

        // print the information of the students according to the ascending order of their names
        System.out.println("\nList of student after sorting according to the ascending order of their name: ");
        student.sort(Comparator.comparing(StudentSort::getName));
        for (StudentSort before : student) {
            System.out.println(before.getName() + " - " + before.getAge());
        }
    }
}

class StudentSort {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public StudentSort(String name, int age) {
        this.name = name;
        this.age = age;
    }
}