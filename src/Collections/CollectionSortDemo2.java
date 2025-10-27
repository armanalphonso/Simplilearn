// Package declaration: Defines that this class belongs to the 'Collections' package.
// Packages help organize related classes and prevent naming conflicts.
package Collections;

// Importing the entire java.util package.
// This allows us to use ArrayList, Collections, and Comparator interfaces.
import java.util.*;

// Main class declaration: 'CollectionSortDemo2' contains the main() method,
// which serves as the entry point for the program.
class CollectionSortDemo2 {

    // Main method: JVM starts program execution from here.
    // 'String[] arg' allows command-line arguments to be passed (though not used here).
    public static void main(String[] arg) {

        // Create a raw (non-generic) ArrayList instance.
        // It can store any type of objects, but it's not type-safe (generics are preferred).
        ArrayList I = new ArrayList();

        // Adding string elements to the ArrayList using the add() method.
        I.add("Z");
        I.add("A");
        I.add("K");
        I.add("L");

        // Printing elements before sorting.
        // ArrayList’s toString() method automatically displays elements in insertion order.
        System.out.println("Before Sorting: " + I);

        // Sorting the ArrayList using Collections.sort().
        // Here, a custom Comparator object (MyComparator7) is passed as the second argument.
        // This allows defining a *custom sorting logic* instead of natural ordering.
        Collections.sort(I, new MyComparator7());

        // Printing the list after sorting with custom Comparator logic.
        System.out.println("After Sorting: " + I);
    }
}

// Class implementing Comparator interface to define custom sorting order.
// Comparator is a functional interface (it has a single abstract method: compare()).
class MyComparator7 implements Comparator {

    // compare() method defines the custom comparison logic.
    // It determines the order of two objects (obj1 and obj2) during sorting.
    // It must return:
    //   - a negative integer if obj1 < obj2
    //   - zero if obj1 == obj2
    //   - a positive integer if obj1 > obj2
    public int compare(Object obj1, Object obj2) {

        // Type casting: Objects from the list are retrieved as Object,
        // so we cast them to String to perform string comparison.
        String s1 = (String) obj1;

        // Alternative way to get the second string (without explicit cast).
        // obj2.toString() converts obj2 to a string safely.
        String s2 = obj2.toString();

        // The natural ordering method for Strings is compareTo().
        // s1.compareTo(s2) gives ascending order (A → Z).
        // Here, we reverse the order by switching operands (s2.compareTo(s1)),
        // thus sorting the list in *descending (Z → A)* order.
        return s2.compareTo(s1);
    }
}