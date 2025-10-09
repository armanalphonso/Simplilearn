// Package declaration (optional) - organizes related classes into a namespace
package String;

public class Test8 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "Alziz"
        String s = "Alziz";

        // The lastIndexOf(char ch) method returns the index of the last occurrence 
        // of the specified character in the string.
        // Syntax: string.lastIndexOf(char ch)
        // It searches the string from right to left.
        // If the character is found, it returns the last index (0-based).
        // If the character is NOT found, it returns -1.

        System.out.println(s.lastIndexOf('i'));  // Output: 3
    }
}