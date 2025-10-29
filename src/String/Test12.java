// Package declaration (optional) - used to organize related classes
package String;

public class Test12 {
    public static void main(String[] args) {
        // Create a StringBuffer object initialized with the string "java"
        // The characters are: j  a  v  a
        //                    0  1  2  3
        StringBuffer sb = new StringBuffer("java");

        // setCharAt(index, char) sets/replaces the character at the specified index
        // In this case, it replaces the character at index 0 ('j') with 'Y'
        sb.setCharAt(0, 'Y');

        // Print the modified StringBuffer
        System.out.println(sb);  // Output: Yava
    }
}