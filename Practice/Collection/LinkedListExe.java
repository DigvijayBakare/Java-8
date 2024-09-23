package Practice.Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExe {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        System.out.println("Original Linked list: " + number);

        // 1. Write a Java program to append the specified element to the end of a linked list.
        number.add(9);
        System.out.println("After appending the element in to linkedList: " + number);

        // 2. Write a Java program to iterate through all elements in a linked list.
        System.out.print("Iterated over the list: ");
        for (Integer integer : number) {
            System.out.print(integer + " ");
        }

        // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.print("\nPrinting the list starting from index 3: ");
        for (int i = 3; i < number.size(); i++) {
            System.out.print(number.get(i) + " ");
        }

        // 4. Write a Java program to iterate a linked list in reverse order.
        System.out.print("\nPrinting the list in the reverse order: ");
        for (int i = number.size() - 1; i >= 0; i--) {
            System.out.print(number.get(i) + " ");
        }

        // 5. Write a Java program to insert the specified element at the specified position in the linked list.
        number.add(0, 0);
        System.out.println("\nAfter inserting the element at 0th index in the list: " + number);

        // 6. Write a Java program to insert elements into the linked list at the first and last positions.
        number.add(0, -1);
        int last = number.size();
        number.add(last, 10);
        System.out.println("After adding first and last element in the list: " + number);

        // 7. Write a Java program to insert the specified element at the front of a linked list.
        number.add(0, -2);
        System.out.println("After inserting the element at the front of list: " + number);

        // 8. Write a Java program to insert the specified element at the end of a linked list.
        number.add(13, 11);
        System.out.println("After inserting the element at the end of list: " + number);

        // 9. Write a Java program to insert some elements at the specified position into a linked list.
        // already done in the above examples

        // 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("First element of the list: " + number.getFirst());
        System.out.println("Last element of the list: " + number.getLast());

        // 11. Write a Java program to display elements and their positions in a linked list.
        for (int i = 0; i < number.size(); i++) {
            System.out.println("Element at index " + i + ": " + number.get(i));
        }

        // 12. Write a Java program to remove a specified element from a linked list.
        number.remove(0);
        System.out.println("List after removing an element: " + number);

        // 13. Write a Java program to remove the first and last elements from a linked list.
        number.removeFirst();
        number.removeLast();
        System.out.println("List after removing the first and last element of the list: " + number);

        // 14. Write a Java program to remove all elements from a linked list.
        number.removeAll(number);
        System.out.println("After removing all the element in the list: " + number);

        // 15. Write a Java program that swaps two elements in a linked list.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("Original list: " + list);
        Collections.swap(list, 1, 2);
        System.out.println("After swapping numbers: " + list);

        // 16. Write a Java program to shuffle elements in a linked list.
        Collections.shuffle(list);
        System.out.println("After shuffling the elements in the list: " + list);

        // 17. Write a Java program to join two linked lists.
        LinkedList<Integer> joinedList = new LinkedList<>();
        joinedList.addAll(number);
        joinedList.addAll(list);
        System.out.println("After joining two lists: " + joinedList);

        // 18. Write a Java program to copy a linked list to another linked list.
        LinkedList<Integer> copy = new LinkedList<>();
        copy.addAll(list);
        System.out.println("Copied list: " + copy);

        // 19. Write a Java program to remove and return the first element of a linked list.
        System.out.println("Removed and returned first element: " + copy.pop());
        System.out.println("List after removing and returning first element: " + copy);

        // 20. Write a Java program to retrieve, but not remove, the first element of a linked list.
        System.out.println("Only returned first element: " + copy.peek());
        System.out.println("List after returning the first element: " + copy);

        // 21. Write a Java program to retrieve, but not remove, the last element of a linked list.
        System.out.println("Only returned last element: " + copy.peekLast());
        System.out.println("List after returning the last element: " + copy);

        // 22. Write a Java program to check if a particular element exists in a linked list.
        System.out.println("Is the element 5 present in the list? " + copy.contains(5));

        // 23. Write a Java program to convert a linked list to an array list.
        System.out.println("Converted to arrayList: " + Arrays.toString(list.toArray()));

        // 24. Write a Java program to compare two linked lists.
        System.out.println("Are the list and copy equal? " + list.containsAll(copy));

        // 25. Write a Java program to check if a linked list is empty or not.
        System.out.println("Is the list empty: " + list.isEmpty());

        // 26. Write a Java program to replace an element in a linked list.
        list.set(3, 10);
        System.out.println("List after replacing 3rd element: " + list);
    }
}
