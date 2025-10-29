package Default_Package;

// Import the HashSet class from java.util package
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of String type to store unique elements
        // Syntax: HashSet<Type> setName = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet using add() method
        // add(E e) adds the specified element if it is not already present
        hashSet.add("A");  // Adds "A"
        hashSet.add("B");  // Adds "B"
        hashSet.add("C");  // Adds "C"
        
        // Adding duplicate element "C"
        // HashSet ignores duplicates, so this will have no effect
        hashSet.add("C");

        // Print the HashSet contents
        // HashSet does not guarantee any specific order of elements
        System.out.println(hashSet);

        // Check if the HashSet contains the element "C"
        // contains(Object o) returns true if element exists in the set
        System.out.println("List contains C or not? " + hashSet.contains("C"));

        // Remove element "A" from the HashSet
        // remove(Object o) removes the specified element if present
        hashSet.remove("A");

        // Print the HashSet after removing element "A"
        System.out.println("List after removing A: " + hashSet);

        // Iterate over each element in the HashSet using enhanced for loop
        // Iteration order is not guaranteed
        for (String item : hashSet) {
            System.out.println(item);
        }
    }
}