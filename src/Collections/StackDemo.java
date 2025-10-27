// Package declaration (optional, used to organize your Java files into groups)
package Collections;

// Import everything from java.util (Stack is part of this package)
import java.util.*;

// Class declaration
class StackDemo {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        
        // Create a new Stack object 's'
        Stack s = new Stack();

        // Push elements onto the stack (Last-In, First-Out - LIFO)
        s.push("A"); // "A" is pushed first
        s.push("B"); // "B" is pushed second
        s.push("C"); // "C" is pushed last and is now on top

        // Print the entire stack
        // Output will be: [A, B, C] (C is on top)
        System.out.println(s);

        // Search for element "A" in the stack
        // search() returns position from the top (1-based index)
        // Stack (top to bottom): C (1), B (2), A (3)
        System.out.println(s.search("A")); // Output: 3

        // Search for element "z" which is not in the stack
        // If element is not found, search() returns -1
        System.out.println(s.search("z")); // Output: -1
    }
}