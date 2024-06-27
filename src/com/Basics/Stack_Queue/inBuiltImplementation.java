package com.Basics.Stack_Queue;

import java.util.*;

public class inBuiltImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(3);
        stack.push(31);
        stack.push(311);
        stack.push(3111);
        stack.push(3111);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Queue
        Queue<Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(33);
        queue.add(333);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Deque
        Deque<Integer> deque= new ArrayDeque<>();
        deque.add(3);
        deque.addFirst(33);
        deque.addLast(444);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
