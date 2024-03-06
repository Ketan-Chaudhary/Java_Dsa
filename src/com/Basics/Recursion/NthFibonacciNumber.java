package com.Basics.Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
   int result= fibonacci(8);
        System.out.println(result);
    }

    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
