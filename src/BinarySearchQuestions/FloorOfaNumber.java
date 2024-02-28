package BinarySearchQuestions;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,17,19,110};
        System.out.println(floor(arr,0));
    }
    static  int floor(int[] arr,int target){
        if(target<arr[0])
            return -1;
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
            mid= start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start= start+1;
            }
            else
                return arr[mid];
        }
        return  arr[end];
    }
}
