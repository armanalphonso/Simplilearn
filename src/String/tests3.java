// Declares that this class is part of the 'String' package (custom package, not java.lang.String)
package String;

// Defines the public class named 'tests3'
public class tests3 {

    // The main method — the starting point of program execution
    public static void main(String[] args) {

        // Declares and initializes a string literal "Alziz"
        // This string is stored in the String constant pool
        String s = "Alziz";

        // Uses the charAt() method to get the character at index 3
        // Strings in Java are zero-indexed: positions start at 0
        // So: 
        // s.charAt(0) = 'A'
        // s.charAt(1) = 'l'
        // s.charAt(2) = 'z'
        // s.charAt(3) = 'i' ← this will be printed
        System.out.println(s.charAt(3)); // Output: i
    }
}