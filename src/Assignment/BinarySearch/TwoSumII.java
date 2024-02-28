package Assignment.BinarySearch;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public static void main(String[] args) {

    }
    static int[] binary(int[] numbers, int target){
        int start=0,mid;
        int end=numbers.length-1;
        while(start<end){
//            mid=start+(end-start)/2;
//
//            if(numbers[mid]>target)
//                end= mid-1;

            int sum= numbers[start]+numbers[end];
            if (sum==target){
                return new int[]{start+1,end+1};
                }
            if (sum>target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
