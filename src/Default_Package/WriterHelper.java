package Default_Package;

import java.util.ArrayList;  // Import ArrayList class
import java.util.List;       // Import List interface

public class WriterHelper {  // Declare class

    public void writeList() {  // Method that writes a list
        try {
            // Create a list with initial capacity 10
            List<Integer> list = new ArrayList<>(10);
            
            // Add a single element at index 0
            list.add(1);
            
            System.out.println("Entering try statement");
            
            // Attempting to access element at index 1 (which doesn't exist)
            Integer a = list.get(1);  // ❌ This throws IndexOutOfBoundsException
            
            // This line will not execute if exception is thrown above
            System.out.println("Accessing the second element: " + a);

        } catch (IndexOutOfBoundsException e) {  // Catch specific exception
            // Print error message if index is invalid
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());

        } finally {
            // This block runs no matter what
            System.out.println("This will always be executed");
        }
    }
}