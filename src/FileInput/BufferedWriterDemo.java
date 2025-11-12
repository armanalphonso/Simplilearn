// Package declaration — defines the package name where this class belongs.
// It helps organize related classes into namespaces.
package FileInput;

// Import statements — these bring in classes from the Java standard library
// that are needed for file writing and handling exceptions.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Class definition — every Java application must have at least one class.
class BufferedWriterDemo {

    // The main() method — the entry point of every Java program.
    // "throws IOException" declares that this method might throw an IOException,
    // which must be handled or declared when performing file I/O.
    public static void main(String[] args) throws IOException {

        // Step 1: Create a FileWriter object.
        // FileWriter is used to write characters to a file.
        // If the file "abc.txt" does not exist, it will be created automatically.
        FileWriter fw = new FileWriter("abc.txt");

        // Step 2: Wrap FileWriter in a BufferedWriter.
        // BufferedWriter provides buffering for efficient writing of text data.
        // It reduces the number of direct write operations to the disk.
        BufferedWriter bw = new BufferedWriter(fw);

        // Step 3: Write a single character.
        // The write(int c) method writes the character represented by the Unicode value of 100.
        // Unicode 100 corresponds to the character 'd'.
        bw.write(100);

        // Step 4: Write a new line.
        // The newLine() method inserts a platform-independent newline character
        // (for example, "\n" on Unix, "\r\n" on Windows).
        bw.newLine();

        // Step 5: Write an array of characters.
        // This writes the contents of the char array {'a', 'b', 'c', 'd'} to the file.
        char[] ch1 = {'a', 'b', 'c', 'd'};
        bw.write(ch1);

        // Write another new line for better formatting.
        bw.newLine();

        // Step 6: Write a String directly.
        // The write(String s) method writes the entire string "durga" to the file.
        bw.write("durga");

        // Add another new line.
        bw.newLine();

        // Step 7: Write another string to the file.
        bw.write("Software solution");

        // Step 8: Flush the buffer.
        // flush() forces any buffered output data to be written to the file immediately.
        bw.flush();

        // Step 9: Close the BufferedWriter.
        // close() closes the stream and also flushes any remaining data.
        // Always close streams to free system resources.
        bw.close();
    }
}