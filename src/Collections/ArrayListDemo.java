// Define a package named 'Collections'
package Collections;

// Import all classes from the java.util package
import java.util.*;

// Define a public class named ArrayListDemo
public class ArrayListDemo {

    // Main method: entry point of the Java program
    public static void main(String[] args) {
        
        // Create a raw ArrayList (no generics specified, so it accepts any Object type)
        ArrayList i = new ArrayList(); 
        
        // Add elements to the ArrayList
        i.add("A");     // Adding a String
        i.add(10);      // Adding an Integer (autoboxed to Integer object)
        i.add("A");     // Adding a duplicate String
        i.add(null);    // Adding a null value

        // Print the current contents of the ArrayList
        // Output: [A, 10, A, null]
        System.out.println(i); 

        // Remove the element at index 2 (third element, which is "A")
        i.remove(2);

        // Print the ArrayList after removal
        // Output: [A, 10, null]
        System.out.println(i); 

        // Insert element "M" at index 2
        i.add(2, "M"); 

        // Append element "N" at the end of the list
        i.add("N");    

        // Print the final ArrayList
        // Output: [A, 10, M, null, N]
        System.out.println(i); 
    }
}