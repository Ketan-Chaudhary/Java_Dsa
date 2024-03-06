package com.Basics.Sorting.InsertionSort;

import java.util.Arrays;

import static com.Basics.Sorting.SelectionSort.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
    int[] arr={5,5,4,3,2,1};
    insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void insertion(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
}
