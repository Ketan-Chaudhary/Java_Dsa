package com.Basics.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int [] arr={3,5,6,2,1,6};
    arr=mergeSort(arr);
    System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        // Base Condition
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        // Dividing the arr into two halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merge= new int[first.length+second.length];
        int i=0;// first array pointer
        int j=0;// second array
        int k=0;// merger array
        while(i<first.length&& j<second.length){
            if (first[i]<second[j]){
                merge[k]=first[i];
                i++;
            }else{
                merge[k]=second[j];
                j++;
            }
            k++;
        }
        // Cases when some elements of the arrays are left over due to the size difference
        // Case 1:
        while(i<first.length){
            merge[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            merge[k]=second[j];
            j++;
            k++;
        }
        return merge;
    }

}
