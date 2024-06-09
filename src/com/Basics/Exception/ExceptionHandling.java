package com.Basics.Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            divide(a,b);
//            int c= a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Runs in every case");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Number can not be divided by zero");
        }
        return a/b;
    }
}
