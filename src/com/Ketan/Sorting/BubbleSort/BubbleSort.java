package com.Ketan.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void bubbleSort(int[] arr){
        int temp;
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
