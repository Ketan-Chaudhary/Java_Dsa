package com.Basics.Stack_Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue= new CustomQueue(5);
        queue.insert(3);
        queue.insert(23);
        queue.insert(53);
        queue.insert(35);
        queue.insert(65);
        queue.display();
        System.out.println( queue.front());
        queue.remove();
        queue.display();
    }
}
