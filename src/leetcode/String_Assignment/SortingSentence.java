package leetcode.String_Assignment;

import java.util.Arrays;

//https://leetcode.com/problems/sorting-the-sentence/
public class SortingSentence {
    public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    static String sortSentence(String s) {
        String[] arr= s.split(" ");
        String[] result= new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int length= arr[i].length()-1;
            char index= arr[i].charAt(length);
            int index_num= index- '0';
             String ans=arr[i].substring(0,index_num-1);

            result[index_num-1]=ans;
        }
        return String.join(" ",result);
    }
}
