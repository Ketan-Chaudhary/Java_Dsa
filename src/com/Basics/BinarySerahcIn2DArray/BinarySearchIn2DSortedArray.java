package com.Basics.BinarySerahcIn2DArray;

import java.util.Arrays;

public class BinarySearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(answer(arr, 9)));
//        System.out.println(arr.length-1);
//        System.out.println(arr[0].length-1);
    }
    static int[] binary(int [][] arr,int target,int row,int colStart,int colEnd){
    while(colStart<=colEnd){
        int mid=colStart+(colEnd-colStart)/2;

        if (arr[row][mid]==target){
            return new int []{row,mid};
        }
        if (arr[row][mid]<target){
            colStart=mid+1;
        }
        else {
            colEnd=mid-1;
        }
    }
    return new int[]{-1,-1};
    }
    static int[] answer(int[][] arr,int target){
        int row=arr.length-1;
        int col=arr[0].length-1;
        int mid;
        if (col==0){
            return new int[]{-1,-1};
        }
        if (row==1){
            return binary(arr,target,0,0,col);
        }
        int rowStart=0;
        int rowEnd=row;
        int midCol= col/2;
        // run the loop till 2 rows are remaining
        //
        while(rowStart<(rowEnd-1)){
             mid= rowStart+(rowEnd-rowStart)/2;
            if (arr[mid][midCol]==target){
                return new int[]{mid,midCol};
            }
            if (arr[mid][midCol]<target){
                rowStart=mid;
            }
            else{
                rowEnd=mid;
            }
        }
        // Check whether the target lies in middle column
        if (arr[rowStart][midCol]==target){
            return new int[]{rowStart,midCol};
        }
        if (arr[rowStart+1][midCol]==target){
            return new int[]{rowStart+1,midCol};
        }
        // Now search in two rows which gives four half
        // 1st half
        if (target<=arr[rowStart][midCol-1])
         return binary(arr,target,rowStart,0,midCol-1);
        // 2nd half
        if (target>=arr[rowStart][midCol+1]&&target<=arr[rowStart][col])
            return binary(arr,target,rowStart,midCol+1,col);
        // 3rd half
        if (target<=arr[rowStart+1][midCol-1])
            return binary(arr,target,rowStart+1,0,midCol-1);
        // 4th half
        //if (target<=arr[rowStart+1][midCol+1]&&target>=arr[rowStart+1][col])
           else {
            return binary(arr, target, rowStart + 1, midCol + 1, col);
        }
    }
}
