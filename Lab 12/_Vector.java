/*
    Demonstrate the use of Collection Framework in Java.
    (Vector)
 */

import java.util.*;

public class _Vector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println("Vector elements: " + numbers+"\n");
        Enumeration<Integer> months = numbers.elements();
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }
        System.out.println("\n1st - "+numbers.firstElement());
        System.out.println("Index 1 - "+numbers.get(1));
        System.out.println("Size - "+numbers.size());
        System.out.println("Index of 30 - "+numbers.indexOf(30));
        System.out.println("Index of 30 - "+numbers.lastIndexOf(30));
        System.out.println("last - "+numbers.lastElement());
        numbers.set(3, 80);
        numbers.remove(2);
        System.out.println("Index 2 - "+numbers.get(2));
        numbers.set(0, 0);
        System.out.println("Index 0 - "+numbers.get(0));
        System.out.println("Size - "+numbers.size());
        numbers.removeAll(numbers);
        numbers.clear();
        System.out.println("Empty - "+numbers.isEmpty());
    }
}