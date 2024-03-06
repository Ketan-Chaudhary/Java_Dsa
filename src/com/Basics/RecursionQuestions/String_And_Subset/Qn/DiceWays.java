package com.Basics.RecursionQuestions.String_And_Subset.Qn;

import java.util.ArrayList;

public class DiceWays {
    public static void main(String[] args){
//    ways("",4);
//        System.out.println(diceList("",4));
        diceFaces("",4,8);
    }
    static void ways(String p, int target){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<= target ; i++) {
            ways(p+i,target-i);
        }
    }

    static ArrayList<String> diceList(String p, int target){
        if (target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        for (int i = 1; i <=6 &&i<=target ; i++) {
            ans.addAll(diceList(p+i,target-i));
        }
        return ans;
    }

    static void diceFaces(String p, int target, int faces){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=faces&&i<=target ; i++) {
            diceFaces(p+i,target-i,faces);
        }
    }
}
