// Package declaration (optional): this class belongs to the 'Collections' package
package Collections;

// Importing all classes from java.util package
import java.util.*;

// Defining a public class named 'LinkedListDemo'
class LinkedListDemo {

    // Main method: Entry point of the Java application
    public static void main(String[] args) {

        // Creating a LinkedList 'l' that can hold any type of objects (raw type, not type-safe)
        LinkedList l = new LinkedList();

        // Adding elements to the LinkedList using add() method
        l.add("Durga");    // adds a String
        l.add(30);         // adds an Integer (autoboxed)
        l.add(null);       // adds a null value
     //   l.add("Durga");    // adds a duplicate String

        // Replacing the element at index 0 with "Software"
        l.set(0, "Software"); // "Durga" is replaced by "Software"

        // Again replacing the element at index 0 with "venky"
        l.set(0, "venky"); // "Software" is now replaced by "venky"

        // Removes the last element of the list (which is "Durga" here)
        l.removeLast();

        // Adds "CCC" to the beginning (head) of the list
        l.addFirst("CCC");

        // Prints the LinkedList
        System.out.println(l); // Output: [CCC, venky, 30, null]
    }
}