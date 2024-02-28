package com.Ketan.BinarySerahcIn2DArray;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int [][] arr= {
                {10,15,20,35},
                {12,17,29,37},
                {19,20,30,41},
                {25,26,32,42}
        };
        System.out.println(Arrays.toString( binary(arr,5)));
    }

    static int[] binary(int[] [] arr, int target){
        int row=0;
        int col= arr.length-1; // if matrices are square matrices
        while(row<=arr.length-1&& col>=0){
            if (arr[row][col]==target)
                return new int[]{row,col};
            if (arr[row][col]<target)
                row++;
            else
                col--;
        }
    return new int[]{-1,-1};
    }
}
