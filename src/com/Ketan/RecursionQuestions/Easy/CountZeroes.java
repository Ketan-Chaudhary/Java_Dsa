package com.Ketan.RecursionQuestions.Easy;

public class CountZeroes {
    public static void main(String[] args){
        int count=0;
        System.out.println(countZeroes(1,count));
    }
    static int countZeroes(int n,int count){
        if(n==0){
            return count;
        }
        if (n%10==0){
            return countZeroes(n/10,count+1);
        }
        else {
            return countZeroes(n / 10, count);
        }

    }
}
