package Practice.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ListArray {
    public static void main(String[] args) {
        // 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
        List<String> list = new ArrayList<String>();
        list.add("Black");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Red");
        list.add("Violet");
        list.add("White");
        System.out.println("Original List: " + list);

        // 2. Write a Java program to iterate through all elements in an array list.
        Iterator<String> ite = list.iterator();
        System.out.print("Using iterator: ");
        while (ite.hasNext()) {
            System.out.print(ite.next() + " ");
        }

        System.out.println("\nUsing enhanced loop: ");
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println("\nUsing stream: ");
        list.stream().forEach(System.out::println);

        // 3. Write a Java program to insert an element into the array list at the first position.
        list.add(0, "Orange");
        System.out.println("After inserting element at first position: " + list);

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("Element at index 3: " + list.get(3));

        // 5. Write a Java program to update an array element by the given element.
        list.set(4, "Pink");
        System.out.println("After updating an element at index 4: " + list);

        // 6. Write a Java program to remove the third element from an array list.
        list.remove(2);
        System.out.println("After removing third element from list: " + list);

        // 7. Write a Java program to search for an element in an array list.
        boolean isPresent = list.contains("Red");
        System.out.println("Is Red color present in the list: " + isPresent);

        // 8. Write a Java program to sort a given array list.
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(list);
        System.out.println("Copied all elements of first array into second array: " + newList);

        // 10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(newList);
        System.out.println("New list after shuffling: " + newList);
    }
}
