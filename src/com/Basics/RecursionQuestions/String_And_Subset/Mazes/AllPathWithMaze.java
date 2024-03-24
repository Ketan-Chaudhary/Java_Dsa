package com.Basics.RecursionQuestions.String_And_Subset.Mazes;

import java.util.Arrays;

public class AllPathWithMaze {
    public static void main(String[] args){
        boolean[][] arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path= new int[arr.length][arr[0].length];
        allDirectionMaze("",arr,0,0,path,1);
    }
    static void allDirectionMaze(String p, boolean[][] maze,int row, int col,int[][] path,int steps){
        if (row== (maze.length-1) && col==maze[0].length-1){
            path[row][col]=steps;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[row][col]==false){
            return;
        }
        maze[row][col]=false;
        path[row][col]=steps;
        if (row<maze.length-1){
            allDirectionMaze(p+'D',maze,row+1,col,path,steps+1);
        }
        if (col<maze[0].length-1){
            allDirectionMaze(p+'R',maze,row,col+1,path,steps+1);
        }
        // Upward Direction
        if (row>1){
            allDirectionMaze(p+'U',maze,row-1,col,path,steps+1);
        }
        // Left Direction
        if (col>1){
            allDirectionMaze(p+'L',maze,row,col-1,path,steps+1);
        }
        // Returning after the function call Changing the modified array to it's original
        maze[row][col]=true;
        path[row][col]=0;
    }
}
