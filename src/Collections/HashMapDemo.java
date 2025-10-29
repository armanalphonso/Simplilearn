package Collections;

import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs (key: String, value: Integer)
        HashMap m = new HashMap();

        // Adding key-value pairs using put()
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);

        // Displaying the HashMap (unordered)
        System.out.println(m);
        // Output: {balaiah=800, chiranjeevi=700, nagarjuna=500, venkatesh=200} (order may vary)

        // Updating the value for the key "chiranjeevi"
        // put() returns the old value (700), which gets printed
        System.out.println(m.put("chiranjeevi", 1000));

        // Get all keys from the HashMap
        Set s = m.keySet();
        System.out.println(s);  // Output: [balaiah, chiranjeevi, nagarjuna, venkatesh]

        // Get all values from the HashMap
        Collection c = m.values();
        System.out.println(c);  // Output: [800, 1000, 500, 200]

        // Get all entries (key-value pairs) from the HashMap
        Set s1 = m.entrySet();
        System.out.println(s1); // Output: [balaiah=800, chiranjeevi=1000, ...] as Set of Map.Entry

        // Creating an Iterator to iterate over the entries (Set of Map.Entry)
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            // Each item is a Map.Entry (key-value pair)
            Map.Entry m1 = (Map.Entry) itr.next();

            // Print the key of each entry
            System.out.println(m1.getKey());

            // If the key is "nagarjuna", update the value to 10000
            if (m1.getKey().equals("nagarjuna")) {
                m1.setValue(10000);  // This safely modifies the value in the map
            }
        }

        // Final map after modification
        System.out.println(m);
        // "nagarjuna" should now have value 10000
    }
}