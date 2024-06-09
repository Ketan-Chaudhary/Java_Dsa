package com.Basics.OOPs.Generics.Comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno=rollno;
        this.marks=marks;
    }


    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student two){
        System.out.println("Comparison occured");
        int diff= (int)(this.marks- two.marks);
        return diff;
        // if difference ==0 : both are equal
        // if difference < 0: negative: two/second object is bigger
        // if difference > 0: positive: first object is bigger
    }

}
