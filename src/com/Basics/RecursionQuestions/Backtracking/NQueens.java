package com.Basics.RecursionQuestions.Backtracking;

public class NQueens {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int row){
        // Base Condition
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // Placing queens
        for(int col=0;col<board.length;col++){
            // Checking the place is safe or not
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                // reverting the changes made
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // checking the vertical row [0-row]
        for(int i=0;i<row;i++){
            if (board[i][col]){
                return false;
            }
        }
        // Diagonal left
        int maxLeft= Math.min(row,col); // max how many col we have to check / travel
        for(int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i]){
                return false;
            }
        }
        // Diagonal right
        int maxRight=Math.min(row, board.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
