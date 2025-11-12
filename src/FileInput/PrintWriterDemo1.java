// Package declaration — groups related classes into the same namespace.
// Helps organize code logically.
package FileInput;

// Import statement — imports all classes from the java.io package.
// We need this to use FileWriter and PrintWriter for file I/O operations.
import java.io.*;

// Class declaration — defines the class PrintWriterDemo1.
// The class contains a main() method which serves as the entry point of the program.
class PrintWriterDemo1 {

    // The main() method — execution starts here.
    // "throws Exception" declares that this method might throw an exception
    // (e.g., if a file cannot be created or accessed).
    public static void main(String[] args) throws Exception {

        // Step 1: Create a FileWriter object.
        // FileWriter is used to write characters to a text file.
        // It creates a new file named "abc.txt" if it doesn’t already exist.
        // (Note: This line is redundant here because we’re not using `fw` later,
        // but we’ll keep it for demonstration purposes.)
        FileWriter fw = new FileWriter("abc.txt");

        // Step 2: Create a PrintWriter object.
        // PrintWriter provides methods to write formatted text (similar to System.out).
        // It can write text representations of any data type (int, boolean, char, etc.).
        // Here we’re writing directly to the file "abc.txt".
        PrintWriter out = new PrintWriter("abc.txt");

        // Step 3: Write a single character.
        // write(int c) writes the character corresponding to the Unicode value of 100.
        // Unicode 100 corresponds to the character 'd'.
        out.write(100);

        // Step 4: println(int x) writes the integer value 100 followed by a newline.
        // Unlike write(), println() converts the argument to a string before writing.
        out.println(100);

        // Step 5: println(boolean b) writes the boolean value ("true") as text.
        out.println(true);

        // Step 6: println(char c) writes the character 'c' followed by a newline.
        out.println('c');

        // Step 7: println(String s) writes the string "durga" followed by a newline.
        out.println("durga");

        // Step 8: Flush the stream.
        // flush() forces any buffered output to be written to the file immediately.
        out.flush();

        // Step 9: Close the stream.
        // Always close streams to release system resources.
        // After closing, you cannot write more data to the file.
        out.close();
    }
}