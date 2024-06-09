package com.Basics.Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
//            divide(a,b);
//            int c= a/b;
            String name= "ketan";
            if (name.equals("ketan")){
                throw  new CustomException("my name is Ketan");
            }} catch (CustomException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            // more strict exception should place first
            // order is important
        } catch (Exception e){
            System.out.println("Other exception handle here");
        } finally {
            System.out.println("Runs in every case");
            // only one finally can be created
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Number can not be divided by zero");
        }
        return a/b;
    }
}
