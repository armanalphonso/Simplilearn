// Package declaration — this class belongs to the 'Collections' package.
// It helps organize related classes together.
package Collections;

// Import statements — these bring in classes from Java's standard library
// that we need to work with properties, input/output, etc.
import java.util.*;  // For Properties class
import java.io.*;    // For File, FileInputStream, FileOutputStream, IOException, etc.

// Class definition — every Java program must have at least one class.
// The class name must match the filename (PropertiesDemo.java).
class PropertiesDemo {

    // main() method — the entry point of every Java program.
    // The JVM starts execution from here.
    public static void main(String[] args) {

        // Try–catch block — used to handle checked exceptions like IOException.
        // If any I/O operation fails, control goes to the catch block.
        try {

            // Create a File object that refers to 'abc.properties'.
            // This file will be created or opened in the current working directory.
            File file = new File("abc.properties");

            // Check if the file exists.
            // If it doesn’t exist, create a new empty one using createNewFile().
            if (!file.exists()) {
                file.createNewFile(); // Creates an empty file
                System.out.println("abc.properties file created successfully!");
            }

            // Create a Properties object — acts like a Hashtable (key-value pair collection).
            // It's used to store configuration data as String pairs.
            Properties p = new Properties();

            // Create a FileInputStream to read data from the file.
            // FileInputStream opens a connection to the file so we can read its contents.
            FileInputStream fis = new FileInputStream(file);

            // Load the existing properties from the file into the Properties object.
            // Each line in the file should be in key=value format.
            p.load(fis);

            // Always close input streams after use to free system resources.
            fis.close();

            // Print all key–value pairs currently loaded in the Properties object.
            System.out.println("Current Properties: " + p);

            // Retrieve a specific property value using its key.
            // If the key "venki" exists, it will print its corresponding value.
            // If not found, it returns null.
            String s = p.getProperty("venki");
            System.out.println("venki: " + s);

            // Add or update a property in memory.
            // If the key already exists, its value will be replaced.
            // If it doesn’t exist, a new key–value pair will be added.
            p.setProperty("nag", "88888");

            // Create a FileOutputStream to write updated properties back to the file.
            FileOutputStream fos = new FileOutputStream(file);

            // Store (save) all key–value pairs into the properties file.
            // The second parameter is a comment that appears at the top of the file.
            p.store(fos, "Updated by Durga for SCJP Demo class");

            // Always close output streams after writing.
            fos.close();

            System.out.println("File updated successfully!");

        } catch (IOException e) {
            // This block executes if any I/O error occurs (like file not found, permission issues, etc.)
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();  // Prints detailed information about the exception.
        }
    }
}