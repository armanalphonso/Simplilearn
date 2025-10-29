// Declares that this class belongs to the 'String' package (user-defined)
package String;

// Defines the public class 'Test4'
public class Test4 {

    // The main method – program execution starts here
    public static void main(String[] args) {

        // Creates a string literal "ALZIZ"
        // Stored in the String constant pool
        String s = "ALZIZ";

        // Compares the content of string 's' with the string literal "Alziz"
        // The .equals() method is case-sensitive, so it compares each character including case
        // "ALZIZ" ≠ "Alziz" due to difference in letter casing
        System.out.println(s.equals("Alziz")); // Output: false
    }
}