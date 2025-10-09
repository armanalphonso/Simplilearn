// Package declaration (optional, used to group classes logically)
package String;

public class Test6 {
    public static void main(String[] args) {
        // Declare and initialize a String variable 's' with the value "ababab"
        String s = "ababab";

        // The replace() method is used to replace all occurrences of character 'a' with character 'b'
        // Syntax: string.replace(oldChar, newChar)
        // oldChar: the character you want to replace ('a')
        // newChar: the character to replace it with ('b')
        // It returns a new string with the replacements (Strings are immutable in Java)

        System.out.println(s.replace('a','b')); // Output: "bbbbbb"
    }
}