package leetcode.BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1,0};
    int target=3;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int peak=peak(arr);
        int ascendingPart= binarySearch(arr,target,0,peak);
        if(ascendingPart==-1)
            return binarySearch(arr,target,peak+1,arr.length-1);
        else
            return ascendingPart;
    }

    static int peak(int[] arr) {
        int start = 0, mid;
        int end = arr.length - 1;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
            return start;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target,int start,int end){
        boolean ascending= arr[start]<arr[end];
        int mid;
        while(start<=end){
            mid= start+ (end-start)/2;
            if (arr[mid]==target)
                return mid;
            if(ascending){
                if (arr[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else {
                if(arr[mid]>target)
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}