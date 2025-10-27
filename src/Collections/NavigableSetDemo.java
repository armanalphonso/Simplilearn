// Package declaration: 
// Groups related classes together under 'Collections'.
package Collections;

// Importing the java.util package to use TreeSet and NavigableSet.
import java.util.*;

// Class definition: Every Java program must have at least one class.
class NavigableSetDemo {

    // The main() method: the entry point of the program.
    public static void main(String[] args) {

        // Creating a TreeSet of Integer type.
        // TreeSet implements the NavigableSet interface.
        // It stores elements in **sorted (ascending)** order and does NOT allow duplicates.
        TreeSet<Integer> t = new TreeSet<Integer>();

        // Adding elements to the TreeSet.
        // They will be automatically sorted in ascending order.
        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);

        // Printing the TreeSet.
        // Output: [1000, 2000, 3000, 4000, 5000]
        System.out.println(t);

        // ceiling(E e): 
        // Returns the **least element ≥ e** (greater than or equal to the given element).
        // Here: ceiling(2000) → 2000 (exact match found)
        System.out.println(t.ceiling(2000));

        // higher(E e): 
        // Returns the **least element > e** (strictly greater than the given element).
        // Here: higher(2000) → 3000
        System.out.println(t.higher(2000));

        // floor(E e): 
        // Returns the **greatest element ≤ e** (less than or equal to the given element).
        // Here: floor(3000) → 3000
        System.out.println(t.floor(3000));

        // lower(E e): 
        // Returns the **greatest element < e** (strictly less than the given element).
        // Here: lower(3000) → 2000
        System.out.println(t.lower(3000));

        // pollFirst(): 
        // Retrieves and removes the **first (lowest)** element from the set.
        // Here: removes 1000
        System.out.println(t.pollFirst());

        // pollLast(): 
        // Retrieves and removes the **last (highest)** element from the set.
        // Here: removes 5000
        System.out.println(t.pollLast());

        // descendingSet(): 
        // Returns a **reverse view** of the set (elements in descending order).
        // Does NOT modify the original set — it's just a view.
        System.out.println(t.descendingSet());

        // Printing the current TreeSet after pollFirst() and pollLast().
        // After removing 1000 and 5000, remaining: [2000, 3000, 4000]
        System.out.println(t);
    }
}