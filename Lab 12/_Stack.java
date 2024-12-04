/*
    Demonstrate the use of Collection Framework in Java.
    (Stack)
 */

import java.util.Stack;

class _Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("pop - "+stack.pop());
        System.out.println("peep - "+stack.peek());
        System.out.println("index of 20 - "+stack.search(20));
        System.out.println("index of 10 - "+stack.search(10));
        System.out.println("index of 20 - "+stack.search(20));
        System.out.println("Empty ?  -  "+stack.empty());
    }
}