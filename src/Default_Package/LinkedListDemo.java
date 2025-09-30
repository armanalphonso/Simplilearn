package Default_Package;

// Import the LinkedList class from java.util package
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        // Create a LinkedList of String type
        LinkedList<String> list = new LinkedList<String>();

        // Add elements "A", "B", "C", "D" to the end of the list
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        
        // Add element "E" at index 2 (3rd position)
        // Elements originally at index 2 and later shift right
        list.add(2, "E"); 

        // Print the LinkedList after additions
        System.out.println(list); // Output: [A, B, E, C, D]

        // Remove the element "B" by specifying the object
        // This removes the first occurrence of "B" in the list
        list.remove("B");

        // Remove the element at index 3 (0-based)
        // After previous removal, list is [A, E, C, D]
        // So index 3 corresponds to "D"
        list.remove(3);

        // Remove first element (head of the list) using remove() without args
        // Removes "A", list now is [E, C]
        list.remove();

        // Remove first element again, removes "E"
        // List now has only ["C"]
        list.remove();

        // Print the final state of the LinkedList
        System.out.println(list);  // Output: [C]
    }
}