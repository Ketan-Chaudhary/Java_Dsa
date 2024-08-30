package com.Basics.Heap.HashMap_HashTable;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // hashDemo();
        MapUsingList<String, String> map = new MapUsingList<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map);


    }

    public static void hashDemo() {
        // String name = "Rahul";

        // Integer a = 4235678;

        // int code = a.hashCode();

        // System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 94);

        // System.out.println(map.get("Karan"));
        // System.out.println(map.getOrDefault("Apoorv", 78));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);
    }
}
