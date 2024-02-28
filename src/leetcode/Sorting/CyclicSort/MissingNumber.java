package leetcode.Sorting.CyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
    int[] arr={4,0,1,2};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i];
            if (nums[i]<nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index <nums.length; index++) {
            if (nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
