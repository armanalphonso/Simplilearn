// Package declaration (optional) - organizes the class into a named package
package String;

public class Test7 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "abcdefg"
        String s = "abcdefg";

        // ----------- First substring() method call -------------
        // Syntax: string.substring(startIndex)
        // Extracts substring from index 3 to the end of the string
        // Indexes:  a  b  c  d  e  f  g
        //           0  1  2  3  4  5  6
        // So, s.substring(3) starts at index 3 ('d') → returns "defg"
        System.out.println(s.substring(3));  // Output: defg

        // ----------- Second substring() method call -------------
        // Syntax: string.substring(startIndex, endIndex)
        // Extracts characters from startIndex to (endIndex - 1)
        // That is: includes character at startIndex, excludes character at endIndex
        // Here: s.substring(3, 4) → includes index 3 ('d'), excludes index 4 ('e')
        // So it returns just "d"
        System.out.println(s.substring(3, 4));  // Output: d
    }
}