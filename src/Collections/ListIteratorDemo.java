// Package declaration (optional, used for organizing code)
package Collections;

// Importing all utility classes (including LinkedList and ListIterator)
import java.util.*;

// Class definition
class ListIteratorDemo {
    
    // Main method – program execution starts here
    public static void main(String[] args) {
        
        // Create a LinkedList object
        LinkedList l = new LinkedList();

        // Add elements (Strings) to the LinkedList
        l.add("Atiful");
        l.add("Shreyas");
        l.add("zishan");
        l.add("Huzaifa");

        // Print the original list
        // Output: [Atiful, Shreyas, zishan, Huzaifa]
        System.out.println(l);

        // Get a ListIterator to traverse the LinkedList
        ListIterator Itr = l.listIterator();

        // Use the ListIterator to loop through the list
        while (Itr.hasNext()) {
            // Get the next element and cast it to String
            String s = (String) Itr.next();

            // If element is "Shreyas", remove it from the list
            if (s.equals("Shreyas")) {
                Itr.remove();  // Safe removal using iterator
            }

            // If element is "Huzaifa", add "zishan" after it
            else if (s.equals("Huzaifa")) {
                Itr.add("zishan");  // Adds "zishan" after "Huzaifa"
            }

            // If element is "zishan", replace it with "sohail"
            else if (s.equals("zishan")) {
                Itr.set("sohail");  // Replaces "zishan" with "sohail"
            }
        }

        // Print the final list after modifications
        System.out.println(l);
    }
}