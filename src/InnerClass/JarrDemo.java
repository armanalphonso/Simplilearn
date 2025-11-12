// Package declaration - this class is part of the InnerClass package
package InnerClass;

// Import statements - allow you to use classes from other Java packages
import java.awt.*;        // Imports classes for GUI components (Frame, Label, etc.)
import java.awt.event.*;  // Imports classes for handling GUI events (WindowEvent, WindowAdapter, etc.)

// Main class declaration
class JarrDemo {
    // main() method - this is the entry point of any Java application
    public static void main(String[] args) {

        // Create a Frame (a top-level window provided by AWT)
        Frame f = new Frame();

        /* 
         * Add a WindowListener to handle window events (like closing the window)
         * Here we use an *anonymous inner class* extending WindowAdapter.
         * WindowAdapter is an abstract class that provides default implementations
         * for all methods in the WindowListener interface.
         */
        f.addWindowListener(new WindowAdapter() {
            // Override the windowClosing() method - called when user tries to close the window
            public void windowClosing(WindowEvent e) {
                // A simple loop that prints a message 10 times before exiting
                for (int i = 1; i <= 10; i++) 
                    System.out.println("I am closing window :" + i);

                    /*
                     * System.exit(0) terminates the program immediately.
                     * Code after this line will not execute.
                     * NOTE: Because System.exit(0) is inside the loop, the program
                     * will exit after printing the first message (i = 1).
                     * To print all 10 messages before closing, move System.exit(0)
                     * outside the loop.
                     */
                    System.exit(0);
                }
        });

        // Add a simple Label (text component) to the Frame
        f.add(new Label("I can create Executable Jar File!!!"));

        // Set the size of the Frame (width=500px, height=500px)
        f.setSize(500, 500);

        // Make the Frame visible on the screen
        f.setVisible(true);
    }
}