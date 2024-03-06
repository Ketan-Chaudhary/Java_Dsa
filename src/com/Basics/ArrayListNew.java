package com.Basics;

import java.util.ArrayList;

public class ArrayListNew {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(4);
        list.add(3);
        list.add(54);
        list.add(66);
        list.add(34);
        list.add(5);
        System.out.println(list);

        list.set(2,55);
        System.out.println( list.contains(44));

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
