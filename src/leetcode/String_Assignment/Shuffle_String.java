package leetcode.String_Assignment;
import java.util.Arrays;
public class Shuffle_String {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,2,1,3};
       String s="codeleet";
        System.out.println(restoreString(s,arr));
    }
    static String restoreString(String s, int[] indices) {
        char[] arr= new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int correctIndex= indices[i];
            arr[correctIndex]= ch;
        }
        return new String(arr);
    }
}
