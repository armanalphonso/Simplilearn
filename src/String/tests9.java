// Package declaration - optional, used to organize related classes
package String;

// Import the Scanner class from the java.util package to read user input
import java.util.*;

class tests9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their city name
        System.out.print("Enter Your City Name: ");

        // Read the full line of input (allows spaces in city names)
        // Apply toLowerCase() to convert the input to lowercase (for case-insensitive comparison)
        // Apply trim() to remove leading and trailing whitespace
        String name = sc.nextLine().toLowerCase().trim();

        // if-else structure to respond based on city name
        // Use .equals() to compare strings in Java

        if (name.equals("hyderabad")) {
            // If the input matches "hyderabad"
            System.out.println("Hello Hyderabadi, Aadaab...");
        } 
        else if (name.equals("chennai")) {
            // If the input matches "chennai"
            System.out.println("Hello Madrasi, Vanakkam...");
        } 
        else if (name.equals("bangalore")) {
            // If the input matches "bangalore"
            System.out.println("Hello Kannadiga, Namaskara...");
        } 
        else {
            // If none of the above match
            System.out.println("Please enter valid city name");
        }
    }
}