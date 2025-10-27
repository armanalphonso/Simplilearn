// Package declaration (optional – used for organizing your code)
package Collections;

// Importing all utility classes from java.util package
import java.util.*;

// Class declaration
class VectorDemo1 {

    // Main method – entry point of the Java program
    public static void main(String[] args) {
        
        // Create a Vector object 'v'
        Vector v = new Vector();

        // Add integers 0 to 10 into the Vector
        for (int i = 0; i <= 10; i++) {
            v.addElement(i); // addElement() adds each number to the end of the vector
        }

        // Print the contents of the Vector
        // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(v);

        // Get an Enumeration object to iterate over the elements of the Vector
        Enumeration e = v.elements();

        // Loop through the Vector using Enumeration
        // Check if more elements are present using hasMoreElements()
        while (e.hasMoreElements()) {

            // Get the next element and cast it to Integer
            Integer I = (Integer) e.nextElement();

            // If the number is even, print it
            if (I % 2 == 0) {
                System.out.println(I); // Prints even numbers: 0, 2, 4, 6, 8, 10
            }

            // Print the full Vector in each loop iteration (not usually needed)
            System.out.println(v);
        }
    }
}