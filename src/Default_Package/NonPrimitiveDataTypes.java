// Package declaration
package Default_Package;

// Class declaration
public class NonPrimitiveDataTypes {

    // Main method: Entry point of the Java application
    public static void main(String[] args) {

        // ======== String (Non-Primitive / Reference Data Type) ========

        // Declaring and initializing a string using a string literal
        // Strings are objects in Java, but can be created without 'new' keyword
        String str = "test";
        System.out.println("String is: " + str);

        // Creating a string using the 'new' keyword
        // This creates a new String object in memory (even if the content is same)
        String str1 = new String("test");
        System.out.println("Another string: " + str1);

        // ======== Array (Non-Primitive / Reference Data Type) ========

        // Declaring an integer array (non-primitive type)
        int arr[];

        // Allocating memory for 2 integer elements in the array
        arr = new int[2];  // Array size is 2 (indexes: 0 and 1)

        // Initializing array elements
        arr[0] = 0;  // First element
        arr[1] = 1;  // Second element

        // ⚠️ This line will cause **ArrayIndexOutOfBoundsException**
        // Because arr[2] does not exist (only indices 0 and 1 are valid)
        arr[2] = 2;

        // Printing the array reference (memory address representation)
        System.out.println(arr);  // Will print something like [I@15db9742

        // Printing the first element of the array
        System.out.println(arr[0]);  // Output: 0
    }
}