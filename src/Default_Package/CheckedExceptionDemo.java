package Default_Package;  // Declares the package name. Optional if you're not using packages.

import java.io.BufferedReader;   // Importing BufferedReader to read text from a character-input stream.
import java.io.FileReader;       // Importing FileReader to read contents from a file.
import java.io.FileNotFoundException; // To handle error if file is not found.
import java.io.IOException;          // To handle general Input/Output exceptions.

public class CheckedExceptionDemo {  // Class definition
    public static void main(String[] args) {  // Main method: program execution starts here

        BufferedReader fileInput = null;  // Declares a BufferedReader object, initially set to null

        try {
            // Creating a FileReader object with the path to the file
            FileReader file = new FileReader("c:\\test\\a.txt");

            // Wrapping FileReader in BufferedReader for efficient reading of lines
            fileInput = new BufferedReader(file);

            // Loop to read first 3 lines of the file
            for (int counter = 0; counter < 3; counter++) {
                String line = fileInput.readLine();  // Reads a single line from the file

                if (line != null) {  // Check if line is not null (end of file not reached)
                    System.out.println(line);  // Print the line to console
                } else {
                    break;  // If no more lines, break out of the loop
                }
            }

        } catch (FileNotFoundException e) {  // Catch block for missing file
            System.out.println("File not found: " + e.getMessage());  // Display error message
        } catch (IOException e) {  // Catch block for other I/O errors
            System.out.println("I/O Error: " + e.getMessage());  // Display error message
        } finally {
            // The finally block runs whether or not an exception occurred
            try {
                if (fileInput != null) {  // Ensure fileInput was successfully created
                    fileInput.close();    // Close the BufferedReader to free system resources
                }
            } catch (IOException e) {
                // Handle exception while closing file
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}