// Package declaration: Groups this class under the 'FileInput' package
package FileInput;

// Import statement: Brings in all classes from java.io for file handling
import java.io.*;

// Declaring a public class named 'DuplicateEliminator'
class DuplicateEliminator {
    
    // The main method: starting point for execution in any Java program
    public static void main(String[] args) throws Exception {
        
        // Create a PrintWriter object to write to "outer.txt"
        // 'PrintWriter' allows easy text output (like System.out.println but for files)
        PrintWriter pw = new PrintWriter("outer.txt");
        
        // Create a BufferedReader to read from "input.txt"
        // 'BufferedReader' reads text efficiently line by line from a file
        BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
        
        // Read the first line from input.txt
        String line = br1.readLine();
        
        // Loop through each line in input.txt until no more lines are found
        while (line != null) {
            
            // Boolean flag to track if the current line already exists in output.txt
            boolean available = false;
            
            // Create another BufferedReader to read from "output.txt"
            // This will check if 'line' from input.txt already exists in output.txt
            BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
            
            // Read the first line from output.txt
            String target = br2.readLine();
            
            // Inner loop: compare current line (from input.txt) with every line in output.txt
            while (target != null) {
                
                // Compare both strings; if they are equal, mark 'available' as true
                if (line.equals(target)) {
                    available = true; // line already exists in output.txt
                    break; // exit inner loop since duplicate is found
                }
                
                // Move to the next line in output.txt
                target = br2.readLine();
            }
            
            // If the current input line was NOT found in output.txt
            if (available == false) {
                // Write the new (unique) line into outer.txt
                pw.println(line);
                
                // Flush the writer to make sure data is immediately written to disk
                pw.flush();
            }
            
            // Read the next line from input.txt
            line = br1.readLine();
        }
    }
}