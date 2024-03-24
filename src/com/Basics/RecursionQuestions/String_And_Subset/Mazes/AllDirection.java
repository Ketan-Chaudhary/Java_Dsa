package com.Basics.RecursionQuestions.String_And_Subset.Mazes;

public class AllDirection {
    public static void main(String[] args){
        boolean[][] arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allDirection("",arr,0,0);
    }
    static void allDirection(String p, boolean[][] maze,int row, int col){
        if (row== (maze.length-1) && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[row][col]==false){
            return;
        }
        maze[row][col]=false;
        if (row<maze.length-1){
            allDirection(p+'D',maze,row+1,col);
        }
        if (col<maze[0].length-1){
            allDirection(p+'R',maze,row,col+1);
        }
        // Upward Direction
        if (row>1){
            allDirection(p+'U',maze,row-1,col);
        }
        // Left Direction
        if (col>1){
            allDirection(p+'L',maze,row,col-1);
        }
        // Returning after the function call Changing the modified array to it's original
        maze[row][col]=true;
    }
}
