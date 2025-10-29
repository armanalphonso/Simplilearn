// Package declaration (optional) - places this class inside the "String" package
package String;

public class Test9 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "Alziz"
        String s = "Alziz";

        // The toUpperCase() method converts all characters in the string to uppercase.
        // Syntax: string.toUpperCase()
        // This method returns a NEW string with all letters in uppercase.
        // The original string remains unchanged (because strings in Java are immutable).

        System.out.println(s.toUpperCase());  // Output: ALZIZ
    }
}