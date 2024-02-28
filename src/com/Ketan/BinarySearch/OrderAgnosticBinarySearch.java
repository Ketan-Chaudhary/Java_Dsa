package com.Ketan.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target){
        int start=0,mid;
        int end=arr.length-1;
       boolean ascending= arr[start]<arr[end];
       while(start<=end){
           mid= start+ (end-start)/2;
           if (arr[mid]==target)
               return mid;
           if(ascending){
               if (arr[mid]>target)
                   end=mid-1;
               else
                   start=mid+1;
           }
           else {
               if(arr[mid]>target)
                   start=mid+1;
               else
                   end=mid-1;
           }
       }
       return -1;
    }
}
