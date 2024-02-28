package leetcode.Sorting.CyclicSort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

     static  List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
            List<Integer> ans= new ArrayList<>();
         for (int j = 0; j < nums.length; j++) {
             if (nums[j]!= j+1){
                ans.add(j+1);
             }
         }
         return ans;
    }

    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
