/*
    Demonstrate the use of Collection Framework in Java.
    (Queue)
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.offer("Orange");
        queue.offer("Mango");
        queue.offer("Strawberry");
        System.out.println("Remove - "+queue.remove());
        System.out.println("Element - "+queue.element());
        System.out.println("\n"+queue);
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        Iterator itr= queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(queue.size());
    }
}