package com.Ketan;

public class String_Java {
    public static void main(String[] args) {
        String a="This is the String";
        String b="This is the String";
        System.out.println(a==b); // This will give true because the object in the pool is same for both the reference variable

        // To create different object according to our will we can use new keyword for creating the same
        String c= new String("Same value");
        String d= new String("Same value");
        System.out.println(c==d); // This will give us false because both the reference variables are pointing to different objects
        // The objects are not in the pool but They are in the heap memeory

        // To compare the value of the String we can use .equals() method
        System.out.println(c.equals(d));
        

    }
}
