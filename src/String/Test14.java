// Package declaration: This class belongs to the 'String' package.
// Note: Java naming convention recommends using lowercase for package names (i.e., 'string').
package String;

// Class declaration: A public class named 'Test14'.
public class Test14 {

    // main method: Entry point of the Java application.
    public static void main(String[] args) {

        // Create a new StringBuffer object with an empty string.
        // Even though the content is empty, it still has a default capacity.
        StringBuffer sb = new StringBuffer("");

        // Print the initial capacity of the StringBuffer.
        // Default capacity = 16 + length of initial string (which is 0 here).
        // So, capacity = 16
        System.out.println(sb.capacity());  // Output: 16

        // ensureCapacity(1000) ensures that the buffer has at least 1000 character spaces.
        // If current capacity < 1000, it increases the capacity using the formula:
        // newCapacity = (oldCapacity * 2) + 2
        // It keeps growing until the capacity is at least 1000.
        sb.ensureCapacity(1000);

        // Print the updated capacity after calling ensureCapacity(1000).
        // The new capacity should be at least 1000.
        System.out.println(sb.capacity());  // Output: 1000 or more, depending on growth logic
    }
}