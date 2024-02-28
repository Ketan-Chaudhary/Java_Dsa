package leetcode.BinarySearch;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int [] arr={ 15, 18, 2, 3, 6, 12};
        System.out.println(rotation(arr));
    }

    static int rotation(int [] arr){
        int pivot= pivot(arr);
        return pivot+1;
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
}
