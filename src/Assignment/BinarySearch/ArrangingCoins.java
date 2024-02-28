package Assignment.BinarySearch;
//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
   //first approach using simple mathematics logic
    static int arrangeCoins1(int n) {
        int ans=1;
        while(n>0){
            ans++;
            n=n-ans;
        }
        return ans-1;
    }

    //second approach using binary search
    static int arrangeCoins(int n) {
        int start=1,mid;
        int end=n;
        int ans = 0;
        while(start<=end) {
            mid = start + (end - start) / 2;
            //sum of the elements till mid using formula of sum of n natural number
            // n*(n+1)/2
            int sum = mid * (mid + 1) / 2;

            if (sum > n)
                end = mid - 1;
            else {
                start = mid + 1;
                ans = Math.max(0, mid);
            }

        }
        return ans;
    }
}
