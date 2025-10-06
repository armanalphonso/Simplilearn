// Declares that this class belongs to the custom package named 'String'
package String;

// Defines the public class named 'tests4'
public class tests4 {

    // The main method – entry point of the program
    public static void main(String[] args) {

        // Declares a string literal "ALZIZ"
        // Stored in the String constant pool
        String s = "ALZIZ";

        // 1st comparison: using equals()
        // The equals() method checks if two strings have exactly the same sequence of characters
        // This comparison is CASE-SENSITIVE
        // "ALZIZ" vs "Alziz" — not the same due to different case in 'L', 'Z', 'I'
        System.out.println(s.equals("Alziz")); // Output: false

        // 2nd comparison: using equalsIgnoreCase()
        // This method compares two strings, ignoring differences in case (uppercase vs lowercase)
        // So "ALZIZ" and "Alziz" are considered equal here
        System.out.println(s.equalsIgnoreCase("Alziz")); // Output: true
    }
}