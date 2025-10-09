// Package declaration (optional) - helps organize your class
package String;

public class tests11 {
    public static void main(String[] args) {
        // Create a StringBuffer object initialized with the string "durga"
        // So, sb contains: A l z i z
        //                  0 1 2 3 4 (indexes)
        StringBuffer sb = new StringBuffer("Alziz");

        // charAt(int index) method returns the character at the specified index
        // Indexing starts from 0 (just like arrays)
        // Here, index 3 corresponds to the character 'i'
        System.out.println(sb.charAt(3));  // Output: i
    }
}