// Package declaration - this means the class is part of the "String" package.
// It's usually written in lowercase by convention, e.g., "string" instead of "String".
package String;

// Class definition - defines a public class named "tests12".
public class tests12 {

    // Main method - this is the entry point of any Java application.
    // It must be declared as public, static, and void with a String array parameter.
    public static void main(String[] args) {

        // Creating a StringBuffer object with the initial content "abcdefgh".
        // StringBuffer is a mutable sequence of characters (unlike String which is immutable).
        StringBuffer sb = new StringBuffer("abcdefgh");

        // sb.delete(2,5) deletes characters from index 2 (inclusive) to index 5 (exclusive).
        // Indexing is 0-based. So this deletes characters at positions 2, 3, and 4.
        // Original string:  a b c d e f g h
        // Indices:          0 1 2 3 4 5 6 7
        // Characters at indices 2 (c), 3 (d), and 4 (e) are removed.
        sb.delete(2, 5);  // Resulting string: "abfgh"

        // Print the modified StringBuffer to the console.
        System.out.println(sb);  // Output: abfgh
    }
}