package com.Basics.RecursionQuestions.String_And_Subset.Qn;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String [] args){
//        phone("","12");
        System.out.println(phoneList("","12"));
        System.out.println(phoneListCount("","12"));
    }
    static void phone(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0'; // converting '2' string into integer 2

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char chToAdd= (char)('a'+ i);
            phone(p+chToAdd,up.substring(1));
        }
    }

    static ArrayList<String> phoneList(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> ans= new ArrayList<>();
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char charToAdd= (char)('a'+i);
            ans.addAll(phoneList(p+charToAdd,up.substring(1)));
        }
        return ans;
    }

    static int phoneListCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int digit= up.charAt(0)-'0';
        int count=0;
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch= (char)('a'+i);
            count= count+phoneListCount(p+ch,up.substring(1));
        }
        return count;
    }
}
