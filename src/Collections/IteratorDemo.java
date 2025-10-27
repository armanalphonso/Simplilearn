// Package declaration (optional)
package Collections;

// Import all classes from java.util package (including ArrayList and Iterator)
import java.util.*;

// Class declaration
class IteratorDemo {
    
    // Main method: Entry point of the program
    public static void main(String[] args) {
        
        // Create an ArrayList to store integers
        ArrayList l = new ArrayList();

        // Add numbers from 0 to 10 to the ArrayList
        for (int i = 0; i <= 10; i++) {
            l.add(i);  // Autoboxing: int → Integer
        }

        // Print the initial list
        System.out.println(l); // Output: [0, 1, 2, ..., 10]

        // Get an Iterator to traverse the list
        Iterator itr = l.iterator();

        // Loop through the list using the Iterator
        while (itr.hasNext()) {
            
            // Get the next element and cast it to Integer
            Integer I = (Integer) itr.next();

            // If the number is even, print it
            if (I % 2 == 0) {
                System.out.println(I); // Print even numbers: 0, 2, 4, 6, 8, 10
            } else {
                // If the number is odd, remove it from the list using iterator
                itr.remove();
            }

            // Print the current state of the list after each iteration
            System.out.println(l);
        }
    }
}