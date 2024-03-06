package com.Ketan.RecursionQuestions.String_And_Subset.Mazes;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        restriction("",maze,0,0);
    }
    static void restriction(String p,boolean[][] maze, int r,int c){
        if (r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
//        if (maze[r][c]==false)
        if (!maze[r][c]){
            return;
        }
        if (r<maze.length-1){
            restriction(p+"D",maze,r+1,c);
        }
        if (c<maze[0].length-1){
            restriction(p+"R",maze,r,c+1);
        }
    }
}
