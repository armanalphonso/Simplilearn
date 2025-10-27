// Package declaration: 
// This class belongs to the 'Collections' package, which helps organize related Java files together.
package Collections;

// Importing the entire java.util package 
// because PriorityQueue is part of java.util.
import java.util.*;

// Class definition — the class name must match the file name (PriorityQueueDemo.java)
class PriorityQueueDemo {

    // main() method — entry point of the Java application
    public static void main(String[] args) {

        // Create a PriorityQueue object 'q'.
        // By default, PriorityQueue stores elements in **natural ordering** (ascending for numbers, alphabetical for strings).
        // It does NOT allow null values.
        PriorityQueue q = new PriorityQueue();

        // peek() method:
        // Returns the **head** (smallest element) of the queue, but does NOT remove it.
        // If the queue is empty, it returns null.
        System.out.println(q.peek()); // Output: null (because the queue is empty)

        // element() method:
        // Similar to peek(), but it throws **NoSuchElementException** if the queue is empty.
        // Since our queue is empty at this moment, this line will throw an exception.
        System.out.println(q.element()); // ❌ Throws NoSuchElementException

        // The following code will not execute if the exception occurs above.
        // So, if you want the program to continue, comment out the line above.

        // for loop — adds integers 0 to 10 (inclusive) to the priority queue.
        // The offer() method inserts elements into the queue.
        for (int i = 0; i <= 10; i++) {
            q.offer(i); // Adds each integer to the queue
        }

        // Print the queue.
        // Note: The internal order may not appear sorted, but the smallest element is always at the head.
        System.out.println(q); 

        // poll() method:
        // Retrieves and removes the head (smallest element) of the queue.
        // Returns null if the queue is empty.
        System.out.println(q.poll()); // Removes and prints the smallest element (0)

        // Print the queue again after removing one element.
        System.out.println(q); // The head (0) is now removed; the next smallest (1) is now the head.
    }
}