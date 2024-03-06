package com.Basics;

public class Occurrence {
    public static void main(String[] args) {
        int a= 345256625;
        int count=0,rem,num;
        num=5;
        while(a!=0){
            rem= a%10;
            if(rem==num)
                count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
