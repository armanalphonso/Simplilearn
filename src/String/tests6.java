// Package declaration (optional), helps organize your classes into namespaces
package String;

public class tests6 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "abcdefg"
        String s = "abcdefg";

        // The substring() method is used to extract a portion of the string
        // Syntax: string.substring(startIndex)
        // This version takes a single argument:
        // startIndex: the starting index (0-based) from which to extract the substring
        // It returns a new string starting from that index to the end of the string

        System.out.println(s.substring(3)); // Output: "defg"
    }
}