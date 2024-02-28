package Questions;

public class NumberOfNumber {
    public static void main(String[] args) {
    int[] arr={1,3,523,5555,67,79};
        System.out.println(find(arr));
    }
    static  int find(int [ ] arr){
        int count=0;
        String check=null;
        for (int i = 0; i < arr.length; i++) {
             check=Integer.toString(arr[i]);
            if (check.length()%2==0){
                count++;
            }
        }
        return  count;
    }
}
