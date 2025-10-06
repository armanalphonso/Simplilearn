// Declares that this class belongs to the 'String' package (custom package name, not java.lang.String)
package String;

// Defines a public class named 'tests'
public class tests {

    // The main method – entry point of any standalone Java application
    public static void main(String[] args) {

        // Creates a new StringBuffer object with the initial content "Alziz"
        // StringBuffer is a mutable sequence of characters (unlike String, which is immutable)
        StringBuffer sb = new StringBuffer("Alziz");

        // Appends the string "Software" to the existing content of sb
        // Since StringBuffer is mutable, this operation modifies the original object in place
        sb.append("Software"); // Now sb contains: "AlzizSoftware"

        // Prints the modified content of the StringBuffer to the console
        System.out.println(sb); // Output: AlzizSoftware
    }
}