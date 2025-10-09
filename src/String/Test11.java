// Package declaration (optional) - organizes the class into a package
package String;

public class Test11 {
    public static void main(String[] args) {
        // Create an empty StringBuffer using the default constructor
        StringBuffer sb = new StringBuffer();  // Default initial capacity is 16

        // Append a string with 16 characters: "abcdefghijklmnop"
        // This fills the entire initial capacity exactly
        sb.append("abcdefghijklmnop");

        // The capacity() method returns the total capacity of the buffer
        // NOT the length of the content
        System.out.println(sb.capacity());  // Output: 16
    }
}