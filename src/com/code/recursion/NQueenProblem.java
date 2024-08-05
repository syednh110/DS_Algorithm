package com.code.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueenProblem {
    private static int count =0;
    public static void main(String[] args) {
        int n = 3;
        List<List<String>> res = placeNQueens(n);
        for (List<String> list : res) {
            System.out.println(list);
        }

        System.out.println("there are n ways for arrangement "+ count);

    }

    private static List<List<String>> placeNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '*';
        List<List<String>> ans = new ArrayList<>();
        traverseDFS(board,0,ans);

        return ans;
    }

    private static void traverseDFS(char[][] board, int col,List<List<String>> ans) {
        if(col==board.length){
            ans.add(construct(board));
            count++;
//            System.out.println("Ways for n queue : "+count++);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validateBoard(board,col,row)){
                board[row][col] = 'Q';
                traverseDFS(board,col+1,ans);
                board[row][col] = '*';
            }
        }
    }

    private static boolean validateBoard(char[][] board, int col, int row) {
        int temCol = col;
        int temRow = row;

        while(col>=0 && row>=0){
            if(board[row][col]=='Q') return false;
            col--;
            row--;
        }

        col = temCol;
        row = temRow;

        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }

        col = temCol;
        row = temRow;

        while(row>=0){
            if(board[row][col]=='Q') return false;
            row--;
        }
        return true;

    }

    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
