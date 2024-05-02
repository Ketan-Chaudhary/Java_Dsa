package com.Basics.OOPs.Static_And_SingletonClass;

public class Main {
    public static void main(String[] args){
        SingletonClass obj1 = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();

        // all 3 ref variables are pointing to just one object
    }
}
