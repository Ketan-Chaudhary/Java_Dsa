package com.Basics;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String s= "This5 is1 the2 new3 String4";
        System.out.println(Arrays.toString(s.split(" ")));
        String[] arr= s.split(" ");
        String[] result= new String[s.length()];
        for (int i = 0; i < arr.length; i++) {
                int length= arr[i].length()-1;
                char index= arr[i].charAt(length);
                int index_num= index- '0';
                String ans= arr[i].replace("index","");
                result[index_num]=ans;
        }


    }
}
