package Assignment.BinarySearch;

public class ValidPerfectSquareNumber {
    public static void main(String[] args) {

    }
     boolean isPerfectSquare(int num) {
        if (num==1)
            return true;
        int squareroot= (int) Math.sqrt((double)num);
        if (squareroot==Math.sqrt((double) num))
            return true;
        else
            return false;
    }
    boolean secondApproach(int num){
        int start=0,mid;
        int end=num;
        while(start<end){
            mid=start+(end-start)/2;
            if (mid*mid==num)
                return true;
            if (mid*mid>num)
               end=mid-1;
            else
                start=mid+1;
        }
        return  false;
    }
}
