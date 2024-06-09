package com.Basics.CloningofObjects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human monu= new Human(18,"Monu Chaudhary");
//        Human twin = new Human(monu);

        Human twin= (Human) monu.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
