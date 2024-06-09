package com.Basics.OOPs.Generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {
   // creating a custom array list with its method
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size =0; // also acts as the index of the arraylist

    public CustomGenericsArrayList(){
        data= new Object[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]= num;
    }

    private void resize() {
        Object[] temp= new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data=temp;
    }

    private boolean isFull()
    {
        return size== data.length;
    }

        @Override
        public String toString(){
        return
                Arrays.toString((data))+ "size" + size;
        }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list= new CustomGenericsArrayList<>();
        list.add(3);
        list.add(4);
        list.add(55);
        list.add(5);
        System.out.println(list);
       // here we created a arraylist of custom data type using generics
    }
}
