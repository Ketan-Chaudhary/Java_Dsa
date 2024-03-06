package com.Basics.Patterns;

public class PatternAll {
    public static void main(String[] args) {
      //  Pattern0(5);
       pattern11(5);

    }
// Pattern 1
    static void pattern0(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Patten 2
    static void pattern2(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern3
    static void pattern3(int n){
        for (int rows = 0; rows <= n; rows++) {
            for (int col = 0; col < n-rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Pattern4
    static void pattern4(int n){
        for (int rows = 0; rows <= n; rows++) {
            for (int col = 0; col < rows; col++) {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }

    //Pattern5
    static void pattern5(int n){
        for (int rows = 0; rows <(2*n+1); rows++) {
            int totalCol=rows>(n-1)? (2*n-rows+1): rows;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern6
    static void pattern6(int n){
        for (int rows = 1; rows < 2*n; rows++) {
           int totalColumn= rows>n? 2*n-rows: rows;
            int spaces= n-totalColumn;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
           for( int col=1; col<= totalColumn;col++){
              System.out.print(" *");
           }
            System.out.println();
        }
    }

    // Patten7
    static void pattern7(int n){
        for(int rows=0;rows<=n;rows++){
            int spaces=n-rows;
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col <rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern8
    static void pattern8(int n){
        for (int rows = 0; rows <= n; rows++) {
            int totalColForEachRow= n-rows;
            int spaces=n-totalColForEachRow;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColForEachRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern9
    static void pattern9(int n){
        for (int rows = 0; rows <= n; rows++) {
            int spaces=n-rows;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern10
    static void pattern10(int n){
        for (int rows = 0; rows < n; rows++) {
            int spaces=rows;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-rows; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // Pattern11
    static void pattern11(int n){
        for (int rows = 0; rows < 2*n; rows++) {
            int spaces= rows>n-1?2*n-rows-1: rows;
            int totalColPerRow= rows>n-1? rows-n+1: n-rows;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalColPerRow; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
