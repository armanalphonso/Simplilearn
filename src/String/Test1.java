// Declares that this class belongs to the 'String' package
package String;

// Defines a public class named 'Test1'
public class Test1 {

    // Entry point of the program
    public static void main(String[] args) {

        // Creates a new String object with the value "Alziz"
        // Even though "Alziz" is a string literal, using 'new' forces the creation of a new object in heap memory
        String s1 = new String("Alziz");

        // Creates another new String object with the same value "Alziz"
        // This is a completely separate object in memory, even though the content is identical
        String s2 = new String("Alziz");

        // Compares the references (memory addresses) of s1 and s2 using ==
        // Since both are created with 'new', they refer to different objects in memory
        System.out.println(s1 == s2); // Output: false

        // Compares the actual contents (values) of the strings using .equals()
        // The .equals() method of the String class compares the sequence of characters
        System.out.println(s1.equals(s2)); // Output: true
    }
}