package com.Basics.RecursionQuestions.String_And_Subset.Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//    permutation("","abc");
//        System.out.println(permutationList("","abc"));
        System.out.println(permutationCount("","abc"));
    }

    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> ans= new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i);
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        char ch= up.charAt(0);
        int count=0;
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i);
            count= count+ permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
