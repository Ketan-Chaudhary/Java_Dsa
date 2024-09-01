package com.Basics.AdvanceSorting.CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void countSort(int[] arr){
        if(arr == null || arr.length <=1){
            return;
        }

        // finding largest element in array
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > max){
                max = num;
            }
        }

        // frequency array
        int[] countArray = new int[max+1];
        for(int num: arr){
            countArray[num]++;
        }

        // Modifying the original array
        int index = 0;
        for(int i=0; i<= max; i++){
            while(countArray[i] > 0){
                arr[index]= i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void countSortHashMap(int[] arr){
        if(arr == null || arr.length <=1) return ;

        // Finding smallest and largest element
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        // Creating frequency map
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int num: arr){
            countMap.put(num , countMap.getOrDefault(num,0)+1);
        }

        // Modifying the original array
        int index = 0;
        for(int i = min; i <= max; i++){
            int count = countMap.getOrDefault(i,0);
            for(int j = 0; j< count; j++){
                arr[index]= i;
                index++;
            }
        }
    }

    public static void main(String[] args){
        int [] arr = {1,3,5,3,3,6,2};
        countSortHashMap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
