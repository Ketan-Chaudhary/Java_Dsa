package com.Ketan.RecursionQuestions.String_And_Subset;

import java.util.ArrayList;

public class SubSequenceWithAscii {
    public static void main(String[] args){
        String s="ab";
//        seq("",s);
        System.out.println(seqArray("",s));
    }

    static void seq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p+ch,up.substring(1));
        seq(p,up.substring(1));
        seq(p+(ch+0),up.substring(1));
    }

    static ArrayList seqArray(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= seqArray(p+ch,up.substring(1));
        ArrayList<String> right= seqArray(p,up.substring(1));
        ArrayList<String> mid= seqArray(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(mid);
        left.remove("");// removing the null
        return left;
    }
}
