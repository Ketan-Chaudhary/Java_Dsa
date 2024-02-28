package com.Ketan.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(maxIndex(arr,0,arr.length-1));
    }
    static  void selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex= arr.length-1-i;
            int maxIndex= maxIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }

   public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
