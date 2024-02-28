package com.Ketan.RecursionQuestions.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,5,6,8,10};
        int target=4;
//        System.out.println(searchRecursion(arr,target,0));
//        checkAllOccurrence(arr,target,0);
//        System.out.println(list);
        ArrayList<Integer> ans=findAllIndex(arr,0,target,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean searchRecursion(int[] arr, int target, int index){
        if (index>=arr.length){
            return false;
        }
        return arr[index]==target || searchRecursion(arr,target,index+1);
    }

    // Finding all possible occurrence in an array
    static ArrayList<Integer> list= new ArrayList<>();
    static void checkAllOccurrence(int[] arr,int target, int index){
        if(index==arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        checkAllOccurrence(arr,target,++index);
    }


    // taking list in arguments
    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,index+1,target,list);
    }
}

