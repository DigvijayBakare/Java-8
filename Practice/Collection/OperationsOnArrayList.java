package Practice.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class OperationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(7);
        list.add("Black");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Red");
        list.add("Violet");
        list.add("White");
        System.out.println("Original List: " + list);

        // 11. Write a Java program to reverse elements in an array list.
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // 12. Write a Java program to extract a portion of an array list.
        System.out.println("Portion of a list: " + list.subList(0, 3));

        // 13. Write a Java program to compare two array lists.
        List<String> listNew = Arrays.asList("New", "List", "For", "Comparing", "Black", "Green", "Blue");
        System.out.println("New List: " + listNew);
        boolean all = list.containsAll(listNew);
        System.out.println("Does New list contains all the elements from list: " + all);

        // 14. Write a Java program that swaps two elements in an array list.
        Collections.swap(list, 0, 2);
        System.out.println("List after swapping two elements: " + list);

        // 15. Write a Java program to join two array lists.
        ArrayList<String> joinedArray = new ArrayList<>();
        joinedArray.addAll(list);
        joinedArray.addAll(listNew);
        System.out.println("Joined two arrays: " + joinedArray);

        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<String> copiedList = (ArrayList<String>) joinedArray.clone();
        System.out.println("Copied list: " + copiedList);

        // 17. Write a Java program to empty an array list.
        joinedArray.clear();
        System.out.println("Emptied the joined list: " + joinedArray);

        // 18. Write a Java program to test whether an array list is empty or not.
        System.out.println("Is the list empty? " + list.isEmpty());

        // 19. Write a Java program for trimming the capacity of an array list.
        joinedArray.trimToSize();
        System.out.println("Trimming the capacity of list: " + copiedList);

        // 20. Write a Java program to increase an array list size.
        list.ensureCapacity(8);
        list.add("Pink");
        System.out.println("New list: " + list);

        // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        list.set(2, "New White");
        System.out.println("Replaced element at index 2: " + list);

        // 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
        int size = list.size();
        System.out.print("Printed list using indexed position: " );
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
