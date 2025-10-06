// Declares that this class is part of the 'String' package (user-defined)
package String;

// Defines a public class named 'Test2'
public class Test2 {

    // The main method – program execution starts here
    public static void main(String[] args) {

        // Creates a new String object with the value "Alziz"
        // Using 'new' forces allocation in the heap (not from the String pool)
        String s = new String("Alziz");

        // Tries to concatenate "Software" to s
        // BUT: String is immutable — this creates a new String ("AlzizSoftware") that is NOT stored
        s.concat("Software"); // <-- result is ignored

        // Concatenates "Solution" to s
        // This time, the result is assigned back to s
        // So now s = "AlzizSolution"
        s = s.concat("Solution");

        // Prints the current value of s, which is "AlzizSolution"
        System.out.println(s); // Output: AlzizSolution
    }
}