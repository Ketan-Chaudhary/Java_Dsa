package com.Basics.Recursion;

public class BSUsingRecursion {
    public static void main(String[] args) {
    int [] arr={2,35,44,66,77,85,88};
    int target=23;
    int result=binarySearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }
    static int binarySearch(int [] arr, int target, int start,int end){
        if(start>end)
            return -1;

        int mid= start+(end-start)/2;
        if (arr[mid]==target)
            return mid;
        if (target<arr[mid]){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
