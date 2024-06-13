package com.Basics.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(54);
        list.insertFirst(33);
        list.insertLast(99);
        list.display();
        list.insert(34,2);
        list.display();
        list.delete(1);
        list.display();

    }
}
