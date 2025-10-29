// Declares the package name as 'Collections'
package Collections;

// Imports all utility classes from java.util, including TreeSet
import java.util.*;

// Class declaration
class TreeSetDemo {

    // Main method: Entry point of the program
    public static void main(String[] args) {

        // Create a TreeSet object named 't'
        // TreeSet stores elements in **sorted order** (natural ordering by default)
        // It also **does not allow null values** and requires all elements to be mutually comparable
        TreeSet t = new TreeSet();

        // Adding String elements to the TreeSet
        t.add("A"); // OK
        t.add("a"); // OK - 'a' > 'A' in Unicode (case-sensitive sorting)
        t.add("B"); // OK
        t.add("Z"); // OK
        t.add("L"); // OK

        // If the above line is removed, the following line would print the sorted set
        System.out.println(t);
    }
}
