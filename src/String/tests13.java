// Package declaration: This declares the class as part of the "String" package.
// Note: Java naming convention suggests using lowercase for package names (e.g., "string").
package String;

// Class definition: A public class named "tests13".
public class tests13 {

    // main method: The starting point of the Java program.
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content "Alziz".
        // StringBuffer is a mutable class used for manipulating character sequences.
        StringBuffer sb = new StringBuffer("Alziz");

        // setLength(2) sets the new length of the StringBuffer to 2 characters.
        // If the new length is less than the current length, the content is truncated.
        // Original: "Alziz" (length 5)
        // After setLength(2): only "Al" remains
        sb.setLength(2);

        // Print the modified StringBuffer content.
        System.out.println(sb);  // Output: Al
    }
}