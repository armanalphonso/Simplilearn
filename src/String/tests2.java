// Declares that this class is part of the 'String' package (user-defined, not java.lang)
package String;

// Declares a public class named 'tests2'
public class tests2 {

    // Main method – the entry point of the Java program
    public static void main(String[] args) {

        // Creates a new String object with the value "Spring"
        String s1 = new String("Spring");

        // Tries to concatenate "Fall" to s1
        // This creates a new String "SpringFall", but the result is NOT stored
        s1.concat("Fall");  // This line has no effect on s1

        // Concatenates "winter" to s1
        // Creates a new string "Springwinter", which is assigned to s2
        String s2 = s1.concat("winter");

        // Tries to concatenate "Summer" to s2
        // This creates "SpringwinterSummer", but the result is NOT stored or used
        s2.concat("Summer"); // Has no effect on s2

        // Print s1 – still "Spring" because strings are immutable and concat didn't affect it
        System.out.println(s1); // Output: Spring

        // Print s2 – it holds the result of s1.concat("winter") → "Springwinter"
        System.out.println(s2); // Output: Springwinter
    }
}