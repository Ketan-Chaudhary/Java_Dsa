package com.Basics;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the terms of fibonacci series : ");
        n=sc.nextInt();
        int first=0;
        int second=1;
        int next = 0,temp;
        int[] arr=new int[n];
        arr[0]=first;
        arr[1]=second;
        for(int i=0;i<n-2;i++){
            next=first+second;
//            temp=first;
            first=second;
            second=next;
            arr[i+2]=next;
        }
        System.out.println(next);
        System.out.println(Arrays.toString(arr));
    }
}