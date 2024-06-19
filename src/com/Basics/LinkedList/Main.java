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
        list.insertR(444,3);
        list.display();

//        DLL list= new DLL();
//        list.insertFirst(44);
//        list.insertFirst(22);
//        list.insert(22,33);
//        list.display();

//        CLL list = new CLL();
//        list.insert(22);
//        list.insert(33);
//        list.insert(44);
//        list.insert(55);
//        list.display();
//        list.delete(33);
//        list.display();
    }
}
