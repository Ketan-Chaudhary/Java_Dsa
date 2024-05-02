package com.Basics.OOPs.Static_And_SingletonClass;

public class StaticClasses {
    public static void main(String[] args) {
    // we cannot access  static classes methods and variable within non-static classes or function
        // static classes means they didn't need any object
        // that's why main function is always static
        // they reside in main memory just like main() function
        // but we can access non-static methods inside a static classes or function

    }

    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        StaticClasses obj = new StaticClasses();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }

    // Static block
    static{
        // only run once when the first object is created i.e when the class is loaded for first time
        System.out.println("Static Block");
    }
}
