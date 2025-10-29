// Declares that the class is part of the 'Collections' package
package Collections;

// Imports all classes from java.util, including TreeSet and Comparator
import java.util.*;

// Class containing the main method
class TreeSetDemo1 {

    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator (MyComparator)
        // This tells TreeSet to use our custom sorting logic instead of natural order
        TreeSet t = new TreeSet(new MyComparator());

        // Add integer elements to the TreeSet
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20); // Duplicate, will be ignored (Set does not allow duplicates)

        // Print the TreeSet elements
        // Output will be in descending order because of custom comparator
        System.out.println(t); // Output: [20, 15, 10, 0]
    }
}

// Custom comparator class implementing Comparator interface
class MyComparator implements Comparator {
    
    // Override the compare method to define custom sorting logic
    public int compare(Object obj1, Object obj2) {
        // Cast objects to Integer (we assume only Integer elements are added)
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;

        // Reverse the usual comparison to get descending order
        if (I1 < I2) {
            return +1; // Swap order: I1 comes after I2
        } else if (I1 > I2) {
            return -1; // I1 comes before I2
        } else {
            return 0;  // Equal values → no duplicate added
        }
    }
}