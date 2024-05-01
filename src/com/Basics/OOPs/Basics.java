package com.Basics.OOPs;

public class Basics {
    public static void main(String [] args){

        // Defining a class
        class Student {
            // methods and variables
            int rollno;
            String name;
            float marks;
            // Constructor
            // automatically invoked when object is created
            // same name as class
            Student(){
                // default constructor with no argument
                // calling constructor from a constructor
                this (1,"ketan chaudhary",99.09f);
            }
            Student(int rollno, String name, float marks){
                    this.rollno =rollno;
                    this.name = name;
                    this.marks = marks;
            }
        }

        // Creating objects(instances of) class
        Student ketan= new Student();
        System.out.println(ketan.name);

    }

}
