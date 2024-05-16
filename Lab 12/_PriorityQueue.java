

import java.util.PriorityQueue;

public class _PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("10");
        pq.add("A");
        pq.add("a");
        pq.add("B");
        pq.add("b");
        pq.offer("Nisarg Lo");
        System.out.println("1st Element - "+pq.element());
        System.out.println("poll - "+pq.poll());
        System.out.println("Remove 'c'? - "+pq.remove("c"));;
        System.out.println("peek - "+pq.peek());
        System.out.println("\nAll Elements :-");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Retrieves elements in ascending order
        }
        // returns as per ascii value.
    }
}
