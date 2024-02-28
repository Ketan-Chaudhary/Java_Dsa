package com.Ketan.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,1,24,56,78,85,466,788,999};
        int search=788;
        System.out.println(index(arr,search));
    }

    static  int index(int[] arr, int element){
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
//            mid= (start+end)/2;
//            Better way to write the above line to avoid out of range error
            mid=start +(end-start)/2;

            if (element<arr[mid]){
                end=mid-1;
            } else if (element > arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
