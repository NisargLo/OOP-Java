/*
    Demonstrate the use of Collection Framework in Java.
    (Set)
 */

import java.util.HashSet;
import java.util.Set;

public class _Set {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Cherry");
        // Iterate over the set
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}


/*
       Other methods of Collection Interface which are applicable in Set Interface :-
       (All these methods are used by me in ArrayList & LinkedList, so please check them.)

    1. add(element): Adds a specific element to the set. Returns false if the element is already present.
    2. addAll(collection): Appends all elements from a given collection to the existing set.
    3. clear(): Removes all elements from the set (does not delete the set itself).
    4. contains(element): Checks if a specific element is present in the set.
    5. containsAll(collection): Verifies if the set contains all elements from a given collection.
    6. isEmpty(): Checks if the set is empty.
    7. iterator(): Returns an iterator for the set (elements are returned in a random order).
    8. remove(element): Removes a specified element from the set.
    9. size(): Returns the number of elements in the set.
 */