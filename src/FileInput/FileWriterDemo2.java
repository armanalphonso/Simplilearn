// Package declaration — defines the package (folder structure) where this class is located.
// Helps organize code logically and avoid naming conflicts.
package FileInput;

// Import statement — allows access to classes in java.io package.
// This is required for using FileWriter, IOException, etc.
import java.io.*;

// Class declaration — the name of the class should match the file name (FileWriterDemo2.java).
class FileWriterDemo2 {

    // The main() method — entry point for the Java program.
    // "throws IOException" means that the method might throw an Input/Output exception
    // (for example, if there’s an error while writing to a file).
    public static void main(String[] args) throws IOException {

        // FileWriter is used to write character data to a file.
        // Constructor syntax: new FileWriter(String filename, boolean append)
        // If 'append' is true, data will be written to the end of the file (not overwrite existing content).
        // Here, "abc.txt" will be created if it doesn’t already exist.
        FileWriter fw = new FileWriter("abc.txt", true);

        // write(int c) — writes a single character.
        // The integer value 100 corresponds to the character 'd' (ASCII/Unicode value of 100).
        fw.write(100);  // writes 'd'

        // write(String str) — writes a string to the file.
        // "\n" represents a newline character (moves to the next line).
        fw.write("durga\nSoftwreSolution");  // writes "durga" and "SoftwreSolution" on a new line

        // write('\n') — writes a newline character explicitly.
        fw.write('\n');  // moves to the next line in the file

        // Create a character array and initialize it with some characters.
        char[] ch1 = {'a', 'b', 'c'};

        // write(char[] ch) — writes an array of characters to the file.
        fw.write(ch1);  // writes "abc"

        // Write another newline for separation.
        fw.write('\n');

        // flush() — forces any data in the writer’s internal buffer to be written to the file immediately.
        // This is important because FileWriter uses buffering for efficiency.
        fw.flush();

        // close() — closes the FileWriter.
        // Always close file streams to release system resources and ensure all data is written properly.
        fw.close();
    }
}