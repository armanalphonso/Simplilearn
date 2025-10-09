// Package declaration: This class is part of the "String" package.
// Note: In practice, package names should be lowercase (i.e., "string") to follow Java conventions.
package String;

// Class declaration: This defines a public class named "Test13".
public class Test13 {

    // main method: The entry point of any standalone Java application.
    // It's the first method executed when the program runs.
    public static void main(String[] args) {

        // Creating a StringBuffer object with the initial content "Alziz".
        // StringBuffer is a mutable sequence of characters (unlike String, which is immutable).
        StringBuffer sb = new StringBuffer("Alziz");

        // Calling the reverse() method on the StringBuffer object.
        // This method reverses the characters in the StringBuffer.
        // "Alziz" becomes "zizlA"
        sb.reverse();

        // Output the reversed StringBuffer to the console.
        System.out.println(sb);  // Output: zizlA
    }
}