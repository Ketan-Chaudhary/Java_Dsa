package com.Basics.Heap.Basics;

import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(22);
        heap.insert(12);
        heap.insert(2);
        heap.insert(20);
        heap.insert(35);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
