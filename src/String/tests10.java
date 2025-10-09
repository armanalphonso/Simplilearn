// Package declaration (optional) - organizes your class into a package
package String;

public class tests10 {
    public static void main(String[] args) {
        // Declare a final reference to a StringBuffer object initialized with "Alziz"
        final StringBuffer sb = new StringBuffer("Alziz");

        // Even though 'sb' is final, you can still modify the contents of the object
        // because StringBuffer is mutable.
        // The append() method adds the given string to the end of the existing buffer.
        sb.append("software");

        // Print the contents of the StringBuffer after appending
        System.out.println(sb);  // Output: Alzizsoftware
    }
}