// Package declaration: This specifies that this class belongs to the 'FileInput' package
package FileInput;

// Importing necessary classes from the java.io package for file input/output
import java.io.*;

// Defining a class named 'FileExtractor'
class FileExtractor {
    
    // The main method: Entry point of the Java program
    public static void main(String[] args) throws Exception {
        // Create a PrintWriter object to write output into a file named "output.txt"
        // 'PrintWriter' allows easy writing of text data (like println())
        PrintWriter pw = new PrintWriter("output.txt");
        
        // Create a BufferedReader object to read text from "input.txt"
        // 'FileReader' reads characters from a file, 'BufferedReader' adds buffering for efficiency
        BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
        
        // Read the first line from input.txt
        String line = br1.readLine();
        
        // Loop continues until all lines in input.txt are processed
        while (line != null) {
            // A boolean flag to check if the current line exists in delete.txt
            boolean available = false;
            
            // Create another BufferedReader to read from "delete.txt"
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
            
            // Read the first line from delete.txt
            String target = br2.readLine();
            
            // Inner loop: compare the current input line with every line in delete.txt
            while (target != null) {
                // If a match is found, set 'available' to true and break the loop
                if (line.equals(target)) {
                    available = true;
                    break; // Exit inner while loop
                }
                // Move to next line in delete.txt
                target = br2.readLine();
            }
            
            // If line was NOT found in delete.txt, write it to output.txt
            if (available == false) {
                pw.println(line); // Writes line followed by a newline
            }
            
            // Read the next line from input.txt
            line = br1.readLine();
        }
        
        // Ensure all buffered data is written to the output file
        pw.flush();
        
        // (Good practice, though missing here: Close readers and writer to release resources)
        // br1.close();
        // pw.close();
    }
}