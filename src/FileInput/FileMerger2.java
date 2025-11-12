// Package declaration — organizes this class inside the 'FileInput' package.
package FileInput;

// Import statement — imports all the classes from the java.io package.
// Needed for FileReader, BufferedReader, and PrintWriter classes used for file I/O operations.
import java.io.*;

// Class declaration — defines a class named FileMerger2.
class FileMerger2 {

    // The main() method — program execution starts here.
    // "throws Exception" allows this method to propagate exceptions like FileNotFoundException or IOException
    // without handling them explicitly using try-catch.
    public static void main(String[] args) throws Exception {

        // Step 1: Create a PrintWriter for the output file.
        // PrintWriter provides convenient methods (print, println) for writing formatted text data.
        // This creates or overwrites a file named "file3.txt".
        PrintWriter pw = new PrintWriter("file3.txt");

        // Step 2: Create BufferedReader objects for both input files.
        // FileReader reads characters from a file.
        // BufferedReader wraps FileReader to improve efficiency and allow reading line-by-line using readLine().
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        // Step 3: Read the first line from each input file.
        // readLine() reads one entire line and returns it as a String.
        // It returns null when the end of the file is reached.
        String line1 = br1.readLine();
        String line2 = br2.readLine();

        // Step 4: Continue looping until both files are completely read.
        // The loop runs as long as either line1 or line2 is not null.
        // (Using logical OR '||' ensures that even if one file ends before the other,
        // the remaining lines from the other file are still processed.)
        while ((line1 != null) || (line2 != null)) {

            // Step 5: If there is a line available in the first file, write it to the output file.
            if (line1 != null) {
                pw.println(line1);        // Write the current line from file1.txt to file3.txt.
                line1 = br1.readLine();   // Read the next line from file1.txt.
            }

            // Step 6: If there is a line available in the second file, write it to the output file.
            if (line2 != null) {
                pw.println(line2);        // Write the current line from file2.txt to file3.txt.
                line2 = br2.readLine();   // Read the next line from file2.txt.
            }
        }

        // Step 7: Flush the PrintWriter.
        // flush() ensures that any data still buffered in memory is written to the file.
        pw.flush();

        // Step 8: Close all the file streams to free system resources.
        // Always close streams when you're done to prevent memory leaks and file locks.
        br1.close();
        br2.close();
        pw.close();
    }
}