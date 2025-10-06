// Declares that this class belongs to a custom package named 'String'
package String;

// Defines a public class named 'Test5'
public class Test5 {

    // The main method – starting point of the Java application
    public static void main(String[] args) {

        // Creates a String literal "Alziz"
        // Stored in the String constant pool
        String s = "Alziz";

        // Checks if the string 's' is empty using isEmpty()
        // The isEmpty() method returns true only if the string length is 0
        // Since "Alziz" has 5 characters, this will return false
        System.out.println(s.isEmpty()); // Output: false
    }
}