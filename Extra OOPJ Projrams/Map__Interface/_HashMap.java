/*
    Use of HashMap
 */

package Map__Interface;
import java.util.HashMap;

public class _HashMap {
    public static void main(String[] args) {
        // Create an empty HashMap with String keys and Integer values
        HashMap<String, Double> map = new HashMap<>();

        // Add elements to the map
        map.put("vishal", 10.5);
        map.put("sachin", 30.1);
        map.put("vaibhav", 20.7);

        // Print size and content of the map
        System.out.println("Size of map is: " + map.size());
        System.out.println("HashMap - "+map);

        // Check if a key is present and print its value
        if (map.containsKey("vishal")) {
            Double value = map.get("vishal");
            System.out.println("Value for key \"vishal\" is: " + value);
        }
    }
}