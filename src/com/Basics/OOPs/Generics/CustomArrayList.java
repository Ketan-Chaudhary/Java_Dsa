package com.Basics.OOPs.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList {
   // creating a custom array list with its method
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size =0; // also acts as the index of the arraylist

    public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]= num;
    }

    private void resize() {
        int[] temp= new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

        @Override
        public String toString(){
        return
                Arrays.toString((data))+ "size" + size;
        }

    public static void main(String[] args) {
        CustomArrayList list= new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(55);
        list.add(5);
        System.out.println(list);
        // the problem in creating this type of custom arraylist we have only one data type limitation , we can cannot have arraylist of different datatype from the above created arraylist it only supports the integer type
        // to work with different data types first option is to create a arraylist by copying the same arraylist and replace it with different data type
        // or to use generics
    }
}
