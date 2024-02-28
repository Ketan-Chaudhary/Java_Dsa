package leetcode.BinarySearch;
//Question link: https://leetcode.com/problems/two-sum/
import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] nums={1,3,5,7};
        int target=6;
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                result[1]=j;}
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
