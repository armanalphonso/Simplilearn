// Package declaration: Declares that this class belongs to the 'String' package.
// Note: Java convention recommends using lowercase for package names ('string' instead of 'String').
package String;

// Class declaration: Defines a public class named 'tests14'.
public class tests14 {

    // The main method: entry point of any standalone Java application.
    public static void main(String[] args) {

        // Create a StringBuffer object with an initial capacity of 1000 characters.
        // No content is added yet, but memory is reserved for 1000 characters.
        StringBuffer sb = new StringBuffer(1000);

        // Append the string "ABC" to the buffer.
        // Now the actual content length is 3, but the capacity is still 1000.
        sb.append("ABC");

        // Print current capacity of the buffer.
        // This shows the internal allocated memory, which is still 1000.
        System.out.println(sb.capacity());  // Output: 1000

        // trimToSize() reduces the buffer's capacity to match its current content length.
        // Since only "ABC" (3 characters) is stored, capacity will be reduced to 3.
        sb.trimToSize();

        // Print new capacity after trimming.
        // This will now be 3, as excess memory has been released.
        System.out.println(sb.capacity());  // Output: 3
    }
}