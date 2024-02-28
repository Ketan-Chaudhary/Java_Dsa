package Questions;

import java.util.Arrays;

public class ReverseOfString {
    public static void main(String[] args) {
        char[] arr= {'h','e','l','l','o'};
        reverse(arr);
    }
    static void reverse(char[] s){
        int end= s.length;
        char[] arr1=new char[end];
        for (int i = 0; i < s.length; i++) {
            arr1[i] = s[end - 1];
            end--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
