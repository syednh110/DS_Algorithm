package com.code.recursion;

public class Sudoko {
    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        solveSudoku(board,0,0);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean solveSudoku(char[][] board, int row, int col) {
        if(row==board.length)
            return true;
        if(col==board[0].length){
           return solveSudoku(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return solveSudoku(board,row,col+1);
        }

        for(char i='1';i<='9';i++){
            if(validateB(board,row,col,i)){
                board[row][col] = i;
                if(solveSudoku(board,row,col+1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean validateB(char[][] board, int row, int col, char num) {
        for(int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
            if(board[i][col]==num){
                return false;
            }

            // Check 3x3 subgrid
            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid

            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }
        return true;
    }
}
