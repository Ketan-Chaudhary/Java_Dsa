package leetcode.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr= {3,3,3};
        System.out.println(pivot(arr));
        System.out.println(ans(arr,3));
    }
    static int ans(int[] arr,int target){

        int pivot= pivot(arr);
        if (pivot==-1)
            return binary(arr,target,0,arr.length-1);
        if (target==arr[pivot])
            return  pivot;
        if (target>=arr[0])
            return binary(arr,target,0,pivot-1);
        else
            return binary(arr,target,pivot+1,arr.length-1);

    }
    static  int pivot(int[] arr){
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            // Listing all the four cases to find the pivot
            // case 1: if mid>mid+1 :  mid is the pivot
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // case 2: if mid<(mid-1) : mid-1 is the pivot
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            // case 3: if (start<= mid):: start = mid+1
            if (arr[start]<=arr[mid])
                start=mid+1;
            // case 4: if(start>=mid) :: end=mid-1
            else
                end=mid-1;
        }
        return -1;
    }
    static int binary(int[] arr,int target,int start,int end){
        while(start<=end){
//            mid= (start+end)/2;
//            Better way to write the above line to avoid out of range error
            int  mid=start +(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
