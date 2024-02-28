package leetcode.BinarySearch;

public class InfiniteLengthArray {
    // Answer is correct but due to the size of array it is giving the error
    
    public static void main(String[] args) {

        int arr[] = new int[]{3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target=100;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
      int start=0;
      int end=1;

//      Check condition for increasing the size of the box in which we are searching
//        while(target>arr[end]){
//            int newStart= end+1;
//            // end= previous end + size of the previous box *2
//            // size of box can be determined using (end-start+1)
//             end= end+ (end-start+1) *2;
//             start= newStart;
//        }
//        return binarySearch(arr,target,start,end);
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static  int binarySearch(int[] arr,int target,int start,int end ){
        int mid;
        while(start<=end){
            mid= start+ (end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
