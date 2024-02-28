package com.Ketan;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println(is_prime(num));
//    To print prime numbers between 0 and 10
        for(int i=1;i<11;i++){
          if(is_prime(i))  {
              System.out.print(i+" ");
          }
        }
    }
    static boolean is_prime(int num){
        if (num==1)
            return true;
        if (num>1){
           for(int i=2;i<=(num/2);i++){
               if (num%i==0)
                   return false;
           }
        }
        return true;
    }
}
