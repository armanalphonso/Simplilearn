// Package declaration — defines the package (folder structure) where this class belongs
// It helps in organizing classes and avoiding naming conflicts
package FileInput;

// Import statement — allows using classes from the java.io package (for File, IOException, etc.)
import java.io.*;

// Class declaration — every Java application must have at least one class
class Test {
    
    // The main method — this is the entry point for any Java program
    // "public" means accessible from anywhere
    // "static" means it belongs to the class, not an object
    // "void" means it doesn't return any value
    // "String[] args" is used to receive command-line arguments
    // "throws Exception" means that this method may throw exceptions that are not handled inside
    public static void main(String[] args) throws Exception {

        // Declare and initialize a counter variable to count the number of files/folders
        int count = 0;

        // Create a File object that represents the directory "C:\durga_classes"
        // Note: Use double backslashes "\\" to escape the backslash character in a string
        File f = new File("C:\\durga_classes");

        // list() method — returns an array of Strings containing the names of files and directories
        // present in the specified directory. If 'f' is not a directory or doesn't exist, it returns null.
        String[] s = f.list();

        // Enhanced for loop (for-each loop)
        // Syntax: for (dataType variable : array)
        // It iterates through each element of the array 's'
        for (String s1 : s) {
            count++; // Increment count for each file or folder
            System.out.println(s1); // Print the file/folder name
        }

        // After the loop, print the total number of files/folders found
        System.out.println("The total number: " + count);
    }
}