// Package name (optional, used to organize classes)
package Collections;

// Importing all classes from java.util package
import java.util.*;

// Class declaration
class VectorDemo {
    // Main method: entry point of the program
    public static void main(String[] args) {
        
        // Create an empty Vector (default capacity = 10)
        Vector v = new Vector();
        
        // Print the initial capacity of the Vector (should be 10)
        System.out.println(v.capacity());
        
        // Add integers 1 to 10 to the Vector
        for (int i = 1; i <= 10; i++) {
            v.addElement(i); // addElement() adds elements at the end
        }
        
        // Capacity remains 10 because we added exactly 10 elements
        System.out.println(v.capacity());
        
        // Add one more element to exceed the current capacity
        v.addElement("A");
        
        // Now, Vector automatically increases its capacity (usually doubles)
        System.out.println(v.capacity()); // Should print 20
        
        // Print all elements in the Vector
        System.out.println(v); // Output: [1, 2, ..., 10, A]
    }
}