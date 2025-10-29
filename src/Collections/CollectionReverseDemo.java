// Package declaration: This class is part of the 'Collections' package.
// Packages are used to organize classes and avoid naming conflicts.
package Collections;

// Importing all classes from java.util package.
// This includes ArrayList and Collections (utility class with static methods).
import java.util.*;

// Main class definition
class CollectionReverseDemo {

    // Main method: program execution starts here.
    public static void main(String[] args) {

        // Creating a raw (non-generic) ArrayList.
        // It can store any type of objects (not type-safe).
        ArrayList I = new ArrayList();

        // Adding integer elements to the list using the add() method.
        I.add(15);
        I.add(0);
        I.add(20);
        I.add(10);
        I.add(5);

        // Print the original list before reversing.
        // ArrayList maintains insertion order.
        System.out.println("Before Reversing: " + I);

        // ❌ ERROR FIX: Should be 'Collections.reverse()', not 'Collection.reverse()'
        // 'Collections' is a utility class in java.util with static methods
        // for operations like sorting, searching, and reversing.
        //
        // The reverse() method reverses the order of elements in the given list.
        Collections.reverse(I);

        // Print the list after reversing.
        System.out.println("After Reversing: " + I);
    }
}