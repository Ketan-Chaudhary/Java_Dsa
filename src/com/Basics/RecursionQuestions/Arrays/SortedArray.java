package com.Basics.RecursionQuestions.Arrays;

public class SortedArray {
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,8,10};
    System.out.println(checkSorted(arr,0));
    }
    static boolean checkSorted(int[] arr, int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && checkSorted(arr,index+1);
    }
}
