package com.Basics.Sorting.CyclicSort;
import java.util.Arrays;
import static com.Basics.Sorting.SelectionSort.SelectionSort.swap;
public class CyclicSort {
    public static void main(String[] args) {
        int [] arr= {3,5,1,2,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex= arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }
}
