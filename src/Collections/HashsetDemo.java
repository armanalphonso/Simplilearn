// Declares that this class is part of the 'Collections' package
package Collections;

// Imports all classes from java.util package, including HashSet
import java.util.*;

// Class declaration
public class HashsetDemo {

    // Main method: Entry point of the Java application
    public static void main(String[] args) {

        // Creating a HashSet object named 'h'
        // HashSet is a collection that contains no duplicate elements and does not maintain insertion order
        // We are using raw type here (not specifying type with generics), so it can store any type of object
        HashSet h = new HashSet();

        // Adding elements to the HashSet
        h.add("C");    // Adds string "C"
        h.add("D");    // Adds string "D"
        h.add("Z");    // Adds string "Z"
        h.add(null);   // Adds null value (HashSet allows one null element)
        h.add(10);     // Adds integer 10 (auto-boxed to Integer object)

        // Try to add "Z" again
        // HashSet does not allow duplicate elements, so this will return false
        System.out.println(h.add("Z")); // Output: false

        // Prints the contents of the HashSet
        // Elements may appear in any order because HashSet is unordered
        System.out.println(h); 
    }
}