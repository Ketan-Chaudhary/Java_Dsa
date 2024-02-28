package com.Ketan;

public class Palindrome {
    public static void main(String[] args) {
        String str= "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str= str.toLowerCase();
        if (str==null || str.length()==0){
            return true;
        }
        int i=0;
        int start= str.charAt(i);
        int end= str.charAt(str.length()-1-i);
        while(start<end){
            if (start!=end){
                return false;
            }
            else {
                i++;
            }
        }
        return true;
    }
}
