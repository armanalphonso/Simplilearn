// Package declaration (optional) - organizes the class into a package named "String"
package String;

public class tests8 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "Alziz"
        String s = "Alziz";

        // The toLowerCase() method converts all characters in the string to lowercase
        // Syntax: string.toLowerCase()
        // This method does not change the original string (since strings are immutable in Java)
        // It returns a NEW string with all lowercase characters

        System.out.println(s.toLowerCase());  // Output: alziz
    }
}