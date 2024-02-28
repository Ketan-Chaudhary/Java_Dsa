package leetcode.BinarySearch;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitLargestSum {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
    int start=0,end=0,mid;
    // finding range where the ans can lie
        for (int i = 0; i < nums.length; i++) {
           start= Math.max(start,nums[i]);
           end+=nums[i];
        }

        // binary search approach
        // we can have minimum 1 sub array
        while(start<end){
            mid=start + (end-start)/2;
            int sum=0,pieces=1;
            for(int num:nums){
                if (sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }

            // check for pieces we have
            if (pieces>k){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
       // return end;// start=end=mid;
    }
}
