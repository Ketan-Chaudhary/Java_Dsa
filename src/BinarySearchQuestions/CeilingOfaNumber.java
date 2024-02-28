package BinarySearchQuestions;

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));
    }
    static  int ceiling(int[] arr, int element){
        if(element>arr[arr.length-1])
            return -1;
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
//            mid= (start+end)/2;
//            Better way to write the above line to avoid out of range error
            mid=start +(end-start)/2;

            if (element<arr[mid]){
                end=mid-1;
            } else if (element > arr[mid]) {
                start=mid+1;
            }
            else {
                return arr[mid];
            }
        }

        return arr[start];
    }

}
