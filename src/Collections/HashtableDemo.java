// Package declaration — the class belongs to the 'Collections' package
package Collections;

// Importing all classes from java.util package
// Hashtable is part of java.util
import java.util.*;

// Main class definition
class HashtableDemo {

    // main() method — entry point of the Java program
    public static void main(String[] args) {

        // ✅ Create a Hashtable instance
        // Syntax: Hashtable<KeyType, ValueType> variableName = new Hashtable<>();
        // Hashtable is similar to HashMap but is synchronized (thread-safe).
        Hashtable h = new Hashtable();

        // ✅ Add key-value pairs to the Hashtable
        // Here, keys are Temp objects and values are Strings.
        // The hashCode() of Temp determines the bucket where the key-value pair is stored.
        h.put(new Temps(5), "A");
        h.put(new Temps(2), "B");
        h.put(new Temps(6), "C");
        h.put(new Temps(15), "D");
        h.put(new Temps(23), "E");
        h.put(new Temps(16), "F");

        // ✅ Print the Hashtable
        // The order of output depends on the hash codes of keys, NOT on insertion order.
        System.out.println(h);
    }
}

// ✅ Custom class used as key in the Hashtable
class Temps {
    int i;  // instance variable to hold an integer key value

    // Constructor — initializes the 'i' variable when creating a Temp object
    Temps(int i) {
        this.i = i;
    }

    // ✅ hashCode() method — returns the hash code for this object
    // Hashtable (and all hash-based collections) use hashCode() to decide where to store keys.
    // Here, we return the integer itself as the hash code.
    public int hashCode() {
        return i;
    }

    // ✅ toString() method — defines how the object should be represented as a String
    // This will be called when printing the Hashtable (e.g., key=5 → "5")
    public String toString() {
        return i + "";
    }
}