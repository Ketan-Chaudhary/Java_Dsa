package com.Ketan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner vara = new Scanner(System.in);
        System.out.print("Enter the input here : ");
        int a= vara.nextInt();
        String str= vara.nextLine();
        float b= vara.nextFloat();
        float b_f= 453.5f;
        double db=vara.nextDouble();
        boolean bl= true;

        System.out.println("This is the variable you entered : "+ a);
    }
}
