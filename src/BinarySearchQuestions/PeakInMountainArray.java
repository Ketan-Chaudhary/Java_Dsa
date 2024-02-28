package BinarySearchQuestions;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int [] arr={10,11,12,13,14,15,4,3,2,1};
        System.out.println(peakInMountainArray(arr));
    }
    static int peakInMountainArray(int[] arr){
        int start=0,mid;
        int end=arr.length-1;

        while(start<end){
            mid= start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
}
