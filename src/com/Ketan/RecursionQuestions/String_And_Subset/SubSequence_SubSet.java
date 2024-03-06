package com.Ketan.RecursionQuestions.String_And_Subset;

import java.util.ArrayList;

public class SubSequence_SubSet {
    public static void main(String[] args){
        String s="abc";
//        subSeq("",s);
        System.out.println(seqArray("",s));
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subSeq(ch+p,up.substring(1));
        subSeq(p,up.substring(1));
    }

    static ArrayList<String> seqArray(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= seqArray(p+ch,up.substring(1));
        ArrayList<String> right= seqArray(p,up.substring(1));
        left.addAll(right);
        left.remove("");// removing the null
        return left;
    }

}
