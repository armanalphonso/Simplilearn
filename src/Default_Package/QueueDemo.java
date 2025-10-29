package Default_Package;

// Import PriorityQueue class and Queue interface from java.util package
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Declare a Queue of Strings and initialize it as a PriorityQueue
        // PriorityQueue orders its elements according to their natural ordering (ascending for Strings)
        Queue<String> queue = new PriorityQueue<>();

        // Add elements to the queue using add() method
        // Elements are internally arranged based on their priority (natural ordering here)
        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        // Print the queue. Output order might not match insertion order
        // because elements are sorted according to priority (alphabetical order here)
        System.out.println("original queue: " + queue);

        // Remove the head element of the queue (the element with highest priority)
        // remove() throws exception if queue is empty
        queue.remove();
        System.out.println("queue after removing the head element: " + queue);

        // Retrieve the head of the queue without removing it
        // peek() returns null if the queue is empty
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Remove and return the head of the queue (poll returns null if empty)
        head = queue.poll();
        System.out.println("removed head: " + head);

        // Print the queue after the poll operation
        System.out.println("queue now look like this: " + queue);
    }
}