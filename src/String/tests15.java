// Package declaration: This class belongs to the 'String' package.
// Note: Java convention recommends using lowercase for package names (e.g., 'string').
package String;

// Class declaration: Defines a public class named 'tests15'.
public class tests15 {

    // Main method: The entry point of the Java program.
    public static void main(String[] args) {

        // Create a StringBuilder object with initial capacity 5.
        // This means it can hold 5 characters before needing to resize.
        // But the current content is empty.
        StringBuilder sb = new StringBuilder(5);

        // Create an empty String object.
        String s = "";

        // First condition: Compare StringBuilder and String using equals().
        if (sb.equals(s)) {
            // This will NOT match, because:
            // - StringBuilder does NOT override the equals() method from Object.
            // - So, sb.equals(s) returns false unless sb and s are the exact same object (which they are not).
            System.out.println("Match 1");
        } 

        // Second condition: Compare their string values using .toString().equals().
        else if (sb.toString().equals(s.toString())) {
            // This WILL match because:
            // - sb.toString() returns an empty string (""), same as s.
            // - So "".equals("") returns true.
            System.out.println("Match 2");
        }

        // If none of the above conditions match.
        else {
            System.out.println("No Match");
        }
    }
}