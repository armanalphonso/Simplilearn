// Package declaration: 
// This class is part of the 'Collections' package (used for organizing code logically).
package Collections;

// Importing java.util package to use PriorityQueue and Comparator classes.
import java.util.*;

// Class definition — PriorityQueueDemo2 contains the main() method (entry point of the program).
class PriorityQueueDemo2 {

    public static void main(String[] args) {

        // Creating a PriorityQueue 'q' with:
        // - initial capacity: 15 (optional, defines internal array size)
        // - custom comparator: new MyComparator5()
        //
        // By default, PriorityQueue sorts elements in **natural order** (ascending).
        // But when we pass a custom comparator, it will use that logic instead.
        PriorityQueue q = new PriorityQueue(15, new MyComparator5());

        // Adding (offering) string elements to the queue.
        // offer() inserts the element according to the priority defined by our comparator.
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");

        // Print the queue.
        // Note: The internal representation of PriorityQueue is a **heap**, not a sorted list.
        // So the printed order may not appear sorted, but the **head** will always have the highest priority element.
        System.out.println(q);
    }
}

// Custom comparator class to define custom sorting logic for the PriorityQueue.
//
// A Comparator interface defines a single method:
//      int compare(Object obj1, Object obj2)
// which returns:
//      +ve → if obj1 > obj2
//      -ve → if obj1 < obj2
//       0  → if obj1 == obj2
//
class MyComparator5 implements Comparator {

    // Override the compare() method to define descending order sorting.
    public int compare(Object obj1, Object obj2) {

        // Typecast both objects to String (since we're inserting Strings in the queue)
        String s1 = (String) obj1;
        String s2 = obj2.toString();

        // Default (ascending) order would be s1.compareTo(s2)
        // To reverse it (descending), we use s2.compareTo(s1)
        return s2.compareTo(s1);
    }
}