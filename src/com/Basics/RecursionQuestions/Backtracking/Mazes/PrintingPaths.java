package com.Basics.RecursionQuestions.Backtracking.Mazes;

import java.util.ArrayList;

public class PrintingPaths {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(pathList("",3,3));
    }
    static void path(String p, int r, int c){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+'D',r-1,c);
        }
        if (c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c){
        if (r==1&&c==1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        if (r>1){
            ans.addAll(pathList(p+'D',r-1,c));
        }
        if (c > 1) {
            ans.addAll(pathList(p+'R',r,c-1));
        }
        return ans;
    }
}
