package com.Basics.CloningofObjects;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,5,3,6,8};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//        // Shallow copy : changes in cloned object result in changes in the original object for objects
//        // for non-primitive data type : object it will point to the original item hence changing the object in clone result in changing the original object
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin =(Human) super.clone(); // this is actually shallow copy
        // Making a deep copy
        twin.arr= new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]= this.arr[i];
        }
        return twin;
    }


}
