// Package declaration: This specifies that this class belongs to the 'Collections' package.
// Packages help organize related classes and avoid name conflicts.
package Collections;

// Import statement: Allows the program to use classes from the 'java.util' package,
// such as ArrayList and Collections.
import java.util.*;

// Class declaration: 'CollectionSortDemo' is a public class containing the main method.
class CollectionSortDemo {

    // Main method: This is the entry point of any Java program.
    // 'String[] args' allows the program to accept command-line arguments.
    public static void main(String[] args) {

        // Creating an ArrayList object.
        // ArrayList is a resizable array implementation of the List interface.
        // The raw type 'ArrayList' is used here (not recommended; should use generics).
        ArrayList I = new ArrayList();

        // Adding elements (Strings) to the ArrayList using the 'add()' method.
        I.add("Z");
        I.add("A");
        I.add("K");
        I.add("N");

        // Uncommenting the next line will cause a ClassCastException at runtime
        // because Integer and String cannot be compared during sorting.
        // I.add(new Integer(10));

        // Uncommenting the next line will cause a NullPointerException during sorting
        // because null cannot be compared with non-null strings.
        // I.add(null);

        // Print the ArrayList before sorting.
        // The 'toString()' method of ArrayList is automatically called when printing,
        // displaying the elements in insertion order.
        System.out.println("Before Sorting: " + I);

        // Sort the ArrayList elements in ascending (natural) order.
        // Collections.sort() sorts the list according to the natural ordering
        // of its elements (for Strings, it’s alphabetical order).
        Collections.sort(I);

        // Print the ArrayList after sorting.
        // The elements will now be displayed in ascending order (A, K, N, Z).
        System.out.println("After Sorting: " + I);
    }
}