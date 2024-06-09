package com.Basics.CloningofObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human monu= new Human(18,"Monu Chaudhary");
//        Human twin = new Human(monu);

        Human twin= (Human) monu.clone();
        System.out.println(twin.age+" "+twin.name);

        twin.arr[0]=44;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString((monu.arr)));
    }
}
