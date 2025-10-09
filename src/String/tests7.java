// Package declaration (optional) - used to organize classes into a namespace
package String;

public class tests7 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "Alziz"
        String s = "Alziz";

        // The indexOf(char ch) method is used to find the index of the first occurrence
        // of the specified character in the string.
        // Syntax: string.indexOf(char ch)
        // Returns:
        // - The index (0-based) of the first occurrence of the character
        // - If the character is NOT found, it returns -1

        System.out.println(s.indexOf('i'));  // Output: 3
    }
}