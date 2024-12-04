/*
    Use of Map Interface
 */

package Map__Interface;
import java.util.*;

public class _Map {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Apple");
        myMap.put(2, "Banana");
        myMap.put(3, "Cherry");
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(4, "Date");
        otherMap.put(5, "Fig");
        myMap.putAll(otherMap);
        System.out.println("\nAll Keys - "+myMap.keySet());
        System.out.println("\nAll Elements - "+myMap.entrySet());
        myMap.putIfAbsent(6, "Grapes");
        myMap.remove(2);
        Set<Integer> keys = myMap.keySet();
        Set<Map.Entry<Integer, String>> entries = myMap.entrySet();
        System.out.println("\nFinal map contents:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        myMap.clear();
    }
}