// Package declaration — specifies the folder (namespace) where this class is located.
package FileInput;

// Import statement — gives access to input/output (I/O) classes from java.io package.
// Required for using File, FileReader, IOException, etc.
import java.io.*;

// Class declaration — defines a public class named FileReaderDemo.
class FileReaderDemo {

    // main() method — the entry point for the Java program.
    // "throws IOException" means that this method may throw an input/output exception
    // (for example, if the file is missing or can't be opened).
    public static void main(String[] args) throws IOException {

        // Step 1: Create a File object that represents an existing file "abc.txt".
        // The File class does not open or read the file — it only represents a file path.
        File f = new File("abc.txt");

        // Step 2: Create a FileReader object to read character data from the file.
        // The FileReader class reads data in 16-bit Unicode characters.
        FileReader fr = new FileReader(f);

        // Step 3: Create a character array with size equal to the file’s length.
        // f.length() returns the number of bytes in the file.
        // We cast it to int because f.length() returns a long.
        char[] ch = new char[(int) f.length()];

        // Step 4: Read characters from the file into the array.
        // fr.read(ch) reads characters from the file and stores them into the array 'ch'.
        fr.read(ch);

        // Step 5: Enhanced for loop (for-each loop) to print each character.
        // Syntax: for (dataType variable : array)
        for (char ch1 : ch) {
            System.out.print(ch1); // Prints characters without adding a newline
        }

        // Print separator line for clarity.
        System.out.println("\n*******************");

        // Step 6: Create another FileReader object for the same file (demonstrates another way to read).
        FileReader fr1 = new FileReader("abc.txt");

        // Step 7: Read data character by character.
        // fr1.read() reads one character at a time and returns its Unicode integer value.
        // If the end of file is reached, it returns -1.
        int i = fr1.read();

        // Step 8: Use a while loop to read the entire file character by character.
        while (i != -1) { // loop continues until end of file
            System.out.println((char) i); // typecast int to char and print each character on a new line
            i = fr1.read(); // read next character
        }

        // Note: FileReader objects should be closed after use to release system resources.
        // In this code, they will be closed automatically when the program exits,
        // but it's better practice to close them manually or use try-with-resources.
    }
}