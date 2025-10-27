// Package declaration — this class is part of the 'Collections' package
package Collections;

// Importing all utility classes from java.util package
// (includes HashMap, WeakHashMap, etc.)
import java.util.*;

// Main class definition
class WeakHashMapDemo {
    
    // main() method — entry point of the program
    // throws InterruptedException because Thread.sleep() may throw it
    public static void main(String[] args) throws InterruptedException {

        // ✅ Create a regular HashMap object
        // HashMap uses strong references for its keys.
        HashMap m = new HashMap();

        // ✅ Create a new Temp object
        // 't' is a strong reference to a Temp object
        Temp t = new Temp();

        // ✅ Put an entry into the HashMap
        // Key → Temp object
        // Value → "durga"
        // Syntax: map.put(key, value);
        m.put(t, "durga");

        // ✅ Print the map contents
        // The Temp object's toString() is called to display key as "temp"
        System.out.println(m);  // Output: {temp=durga}

        // ✅ Make the reference 't' null
        // Now there are no references to the Temp object from variable 't'
        // BUT HashMap still holds a *strong reference* to that Temp object as a key,
        // so it will NOT be garbage-collected.
        t = null;

        // ✅ Request garbage collection
        // This calls the GC, which *may* invoke finalize() on eligible objects.
        System.gc();

        // ✅ Pause the main thread for 5 seconds
        // Gives GC enough time to run finalize() if applicable
        Thread.sleep(5000);

        // ✅ Print the map again after GC attempt
        System.out.println(m);
        // Output: {temp=durga}
        // The Temp object is still in the map because HashMap keeps a strong reference.
    }
}

// Separate class Temp used as key in the map
class Temp {
    // ✅ toString() method override
    // Used to display the key in readable form
    public String toString() {
        return "temp";
    }

    // ✅ finalize() method override
    // This method is called by the garbage collector
    // *only if* the object is eligible for GC.
    public void finalize() {
        System.out.println("Finalize method called");
    }
}