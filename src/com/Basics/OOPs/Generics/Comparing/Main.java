package com.Basics.OOPs.Generics.Comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal= new Student(1,89.43f);
        Student monu = new Student(2,99.88f);
        Student rahul = new Student(3,90.55f);


        Student[] list= {kunal, monu,rahul};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks-o2.marks);
//          //     return -(int)(o1.marks-o2.marks); for descending order sorting
//            }
//        });

        // Second way using lambda function
        Arrays.sort(list, (o1,o2)->(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));


//        if (kunal.compareTo(monu) < 0) {
//            System.out.println("Monu has more marks :");
//            System.out.println(kunal.compareTo(monu));
//        }
    }
}
