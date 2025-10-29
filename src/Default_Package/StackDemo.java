package Default_Package;

// Importing the Stack class from java.util package
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a Stack object that stores String elements.
        // Stack follows Last-In-First-Out (LIFO) principle.
        Stack<String> stack = new Stack<>();

        // Adding elements to the stack using push() method
        // Elements are added to the top of the stack
        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        // Print the entire stack; elements shown from bottom to top
        System.out.println("Stack: " + stack);

        // Remove and return the element at the top of the stack using pop()
        // Here it removes and returns "India" (the last pushed element)
        String poppedElement = stack.pop();
        System.out.println("popped element: " + poppedElement);

        // Print the stack after popping the top element
        System.out.println("Now the stack look like: " + stack);

        // Retrieve but do not remove the top element using peek()
        // Here it returns "Germany", which is now at the top
        String poppedElement1 = stack.peek();
        System.out.println("popped element1: " + poppedElement1);
    }
}