// Package declaration - declares that this class is part of the 'String' package
package String;

// Class definition - defines a public class named 'Test'
public class Test {

    // Main method - entry point of the Java program
    public static void main(String[] args) {
        
        // Create a new String object with the value "Alziz"
        // Even though strings are usually created like: String s = "Alziz";
        // This uses the 'new' keyword to explicitly create a new String object in heap memory
        String s = new String("Alziz");
        
        // Attempt to concatenate "software" to the string 's'
        // BUT strings in Java are immutable, so this does NOT change 's'
        // The result of s.concat("software") is a NEW string, but it is NOT stored or used
        s.concat("software");
        
        // Print the original string
        // Since the concat result wasn't stored, 's' is still just "Alziz"
        System.out.println(s); // Output: Alziz
    }
}