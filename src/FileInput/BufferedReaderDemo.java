// Package declaration — groups related classes together into a namespace.
package FileInput;

// Import statement — imports all classes from java.io package.
// This allows us to use classes like FileReader and BufferedReader for file operations.
import java.io.*;

// Class declaration — defines a class named BufferedReaderDemo.
class BufferedReaderDemo {

    // The main() method — the entry point of the Java application.
    // It must be declared as "public static void main(String[] args)" to run correctly.
    // "throws Exception" means the method can throw exceptions (e.g., file not found).
    public static void main(String[] args) throws Exception {

        // Step 1: Create a FileReader object.
        // FileReader reads data from a file in the form of characters.
        // It is suitable for reading text files.
        FileReader fr = new FileReader("abc.txt");

        // Step 2: Wrap the FileReader inside a BufferedReader.
        // BufferedReader adds buffering — meaning it reads chunks of data at once
        // instead of reading character-by-character from the disk.
        // This improves efficiency and performance.
        BufferedReader br = new BufferedReader(fr);

        // Step 3: Read the first line from the file.
        // readLine() reads one entire line at a time and returns it as a String.
        // It returns null when the end of the file is reached.
        String line = br.readLine();

        // Step 4: Loop through the file until no more lines are found.
        // The while loop continues as long as "line" is not null.
        while (line != null) {
            // Print the current line to the console.
            System.out.println(line);

            // Read the next line from the file.
            line = br.readLine();
        }

        // Step 5: Close the BufferedReader.
        // This releases the system resources associated with the reader.
        // Closing the BufferedReader also automatically closes the FileReader.
        br.close();
    }
}