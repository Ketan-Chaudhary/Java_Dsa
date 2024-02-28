package leetcode;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(nums,6)));
    }

    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[n];
        int mid= (n/2)-1;
        int s=0;
        int i=0;
        // for(int i=0;i<n-1;i++)
        while(i<mid){
            ans[i]=nums[s];
            i++;
            s++;
            ans[i]=nums[mid];
            mid++;
        }
        return ans;
    }
}
