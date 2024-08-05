package com.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        List<String> ans = findPath(a);
        for (String s:ans){
            System.out.println(s);
        }
    }

    private static List<String> findPath(int[][] a) {
        boolean[][] vis = new boolean[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                vis[i][j] = false;
            }
        }
        List<String> ans = new ArrayList<>();
        if(a[0][0]==1){
            solveMaze(a,ans,vis,"",0,0);
        }
        return ans;
    }

    private static void solveMaze(int[][] a, List<String> ans, boolean[][] vis,String move,int row,int col) {
        if(row==a.length-1 && col == a.length-1){
            ans.add(move);
            return;
        }

        //downward
        if(row+1<a.length && !vis[row+1][col] && a[row+1][col]==1){
            vis[row][col] = true;
            solveMaze(a,ans,vis,move+"D",row+1,col);
            vis[row][col] = false;
        }

        //left
        if(col-1>=0 && !vis[row][col-1] && a[row][col-1]==1){
            vis[row][col] = true;
            solveMaze(a,ans,vis,move+"L",row,col-1);
            vis[row][col] = false;
        }

        //right
        if(col+1<a.length && !vis[row][col+1] && a[row][col+1]==1){
            vis[row][col] = true;
            solveMaze(a,ans,vis,move+"R",row,col+1);
            vis[row][col] = false;
        }

        //upward
        if(row-1>=0 && !vis[row-1][col] && a[row-1][col]==1){
            vis[row][col] = true;
            solveMaze(a,ans,vis,move+"U",row-1,col);
            vis[row][col] = false;
        }

    }
}
