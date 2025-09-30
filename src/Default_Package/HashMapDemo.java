package Default_Package;

// Importing HashMap and Map interfaces from java.util package[web:6]
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Declare and initialize a Map with String keys and Integer values using HashMap[web:1][web:6]
        Map<String, Integer> map = new HashMap<>();

        // Insert key-value pairs using put(key, value) method[web:1][web:6]
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        // Print the size of the map using size() method[web:1][web:6]
        System.out.println("Size of map is:-" + map.size());

        // Print the entire map, showing all key-value pairs[web:1][web:6]
        System.out.println(map);

        // Check if map contains a specific key ("a") using containsKey()[web:1][web:6]
        if (map.containsKey("a")) {
            // Retrieve the value for key "a" using get(key) method[web:1][web:6]
            Integer a = map.get("a");
            System.out.println("value for key\"a\"is:-" + a);
        }

        // Iterate through all keys using keySet() and print each key with its value[web:1][web:6][web:3]
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", value: " + map.get(key));
        }
    }
}