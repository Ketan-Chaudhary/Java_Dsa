package com.Ketan;
import java.util.Scanner;
public class Funct {
    public static void main(String[] args) {
    sum();
    }
  static  void sum(){
        Scanner sc= new Scanner(System.in);
        int a,b,s;
        System.out.print("Enter the numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        System.out.println(s);
    }
}
