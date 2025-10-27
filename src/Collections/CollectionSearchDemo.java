// Package declaration: This specifies that this class belongs to the 'Collections' package.
// Packages help organize classes and prevent naming conflicts.
package Collections;

// Import statement: Imports all utility classes from the java.util package.
// We need this for ArrayList, Collections, and binarySearch().
import java.util.*;

// Main class declaration.
class CollectionSearchDemo {

    // Main method — the entry point of the Java application.
    public static void main(String[] args) {

        // Creating a raw (non-generic) ArrayList.
        // It can store objects of any type, but it is not type-safe (generics are preferred).
        ArrayList I = new ArrayList();

        // Adding elements (Strings) to the ArrayList using add() method.
        I.add("Z");
        I.add("A");
        I.add("M");
        I.add("K");
        I.add("a"); // Lowercase 'a' has a different ASCII value than uppercase letters.

        // Print the list before sorting.
        // The default toString() method prints elements in insertion order.
        System.out.println("Before Sorting: " + I);

        // ❌ ERROR FIX 1:
        // The class name is 'Collections', not 'Collection'.
        // Collections.sort() sorts the list in ascending (natural) order.
        Collections.sort(I);

        // Print the list after sorting.
        System.out.println("After Sorting: " + I);

        // ❌ ERROR FIX 2:
        // Again, use 'Collections', not 'Collection'.
        // Collections.binarySearch() performs binary search on a *sorted* list.
        // It returns the index of the specified element if found, otherwise returns a negative value.
        System.out.println("Search result for 'Z': " + Collections.binarySearch(I, "Z"));
        System.out.println("Search result for 'J': " + Collections.binarySearch(I, "J"));
    }
}