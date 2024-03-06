package com.Basics.RecursionQuestions.Arrays;

public class RBS {
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,1,2,3};
        int target=00;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[]arr, int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid= s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if (arr[s]<=target&& arr[mid]>=target){
                return search(arr,target,s,mid-1);
            }
            else {
                return search(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid]&& target<=arr[e]){
            return search(arr,target,mid+1,e);
        }
        return search(arr,target,s,mid-1);
    }
}
