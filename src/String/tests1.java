// Declares that this class is part of the 'String' package
package String;

// Defines a public class named 'tests1'
public class tests1 {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creates a new StringBuffer object with the content "Alziz"
        StringBuffer sb1 = new StringBuffer("Alziz");

        // Creates another new StringBuffer object with the same content "Alziz"
        // Note: This is a different object in memory from sb1
        StringBuffer sb2 = new StringBuffer("Alziz");

        // Compares references (memory locations) of sb1 and sb2 using ==
        // Since both are separate objects, this returns false
        System.out.println(sb1 == sb2); // Output: false

        // Compares sb1 and sb2 using .equals()
        // StringBuffer does NOT override the .equals() method from Object class
        // So this behaves like '==', and compares references, not content
        System.out.println(sb1.equals(sb2)); // Output: false
    }
}