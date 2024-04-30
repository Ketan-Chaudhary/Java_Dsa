package com.Basics.RecursionQuestions.Backtracking.Mazes;

public class CountPathsMaze {
    public static void main(String[] args) {
        System.out.println(ways(3,3));
    }
    static int ways(int c,int r){
        if (c==1 || r==1){
            return 1;
        }
        int right= ways(c-1,r);
        int left=ways(c,r-1);
        return  left+right;
    }
}
