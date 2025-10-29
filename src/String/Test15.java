// Package declaration: Declares that this class belongs to the 'String' package.
// Note: Java convention suggests using lowercase for package names (e.g., 'string').
package String;

// Class declaration: Defines a public class named 'Test15'.
public class Test15 {

    // Main method: Entry point of the Java application.
    public static void main(String[] args) {

        // Create a new StringBuilder instance with default capacity (16 characters).
        StringBuilder sb = new StringBuilder();

        // Chaining multiple StringBuilder methods together:
        sb.append("Alziz")        // Step 1: Append "Alziz"
          .append("solution")     // Step 2: Append "solution" → Now the string is "Alzizsolution"
          .reverse()              // Step 3: Reverse the string → "noituloszizlA"
          .insert(2, "xyz")       // Step 4: Insert "xyz" at index 2 → "noxyzituloszizlA"
          .delete(3, 7);          // Step 5: Delete characters from index 3 (inclusive) to 7 (exclusive)
                                  // Characters at indices 3 to 6 are removed ("yzit")
                                  // Final string: "noxuloszizlA"

        // Print the final result
        System.out.println(sb);  // Output: noxuloszizlA
    }
}