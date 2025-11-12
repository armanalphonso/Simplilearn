// Package declaration — organizes the class inside the 'FileInput' package.
package FileInput;

// Import statement — imports all classes from the java.io package.
// Needed for classes like PrintWriter, BufferedReader, and FileReader.
import java.io.*;

// Public class declaration — defines a class named FileMerge.
// The class must be public because its name matches the filename (FileMerge.java).
public class FileMerge {

    // The main() method — the entry point for every Java program.
    // "throws Exception" declares that this method might throw exceptions
    // (for example, FileNotFoundException or IOException).
    public static void main(String[] args) throws Exception {

        // Step 1: Create a PrintWriter for the output file.
        // PrintWriter provides convenient methods (print, println, write)
        // to write data to text files.
        // This creates a new file named "file3.txt".
        // If the file already exists, it will be overwritten.
        PrintWriter pw = new PrintWriter("file3.txt");

        // Step 2: Create a BufferedReader to read from the first input file.
        // FileReader reads characters from "file1.txt",
        // and BufferedReader wraps it for efficient reading (line-by-line).
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));

        // Step 3: Read the first line from file1.txt.
        // readLine() reads one line of text and returns it as a String.
        // It returns null when the end of the file is reached.
        String line = br.readLine();

        // Step 4: Read and write all lines from file1.txt.
        // The loop continues until there are no more lines (line == null).
        while (line != null) {
            // Write the line to file3.txt using PrintWriter.
            pw.println(line);
            // Read the next line from file1.txt.
            line = br.readLine();
        }

        // Step 5: Close the first BufferedReader.
        // This frees system resources associated with reading file1.txt.
        br.close();

        // Step 6: Reassign the BufferedReader to read from the second input file.
        // This now reads from "file2.txt".
        br = new BufferedReader(new FileReader("file2.txt"));

        // Step 7: Read and write all lines from file2.txt.
        line = br.readLine();
        while (line != null) {
            // Write each line from file2.txt to file3.txt.
            pw.println(line);
            line = br.readLine();
        }

        // Step 8: Flush the PrintWriter.
        // flush() forces all buffered output to be written to the file immediately.
        pw.flush();

        // Step 9: Close the second BufferedReader and PrintWriter.
        // Closing the streams releases the file handles and system resources.
        br.close();
        pw.close();
    }
}