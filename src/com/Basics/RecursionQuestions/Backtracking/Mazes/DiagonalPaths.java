package com.Basics.RecursionQuestions.Backtracking.Mazes;

import java.util.ArrayList;

public class DiagonalPaths {
    public static void main(String[] args) {
        diagonal("",3,3);
        System.out.println(diagonalList("",3,3));
    }
    static void diagonal(String p, int r, int c){
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1) {
            diagonal(p+"d",r-1,c-1);
        }
        if (r > 1) {
            diagonal(p+'D',r-1,c);
        }
        if (c>1){
            diagonal(p+"R",r,c-1);
        }
    }

    static ArrayList<String> diagonalList(String p, int r, int c){
        if (r == 1 && c == 1) {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(diagonalList(p+"d",r-1,c-1));
        }
        if (r > 1) {
            ans.addAll(diagonalList(p+'D',r-1,c));
        }
        if (c>1){
            ans.addAll(diagonalList(p+"R",r,c-1));
        }
        return ans;
    }
}
