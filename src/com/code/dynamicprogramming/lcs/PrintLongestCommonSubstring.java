package com.code.dynamicprogramming.lcs;

public class PrintLongestCommonSubstring {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "aabcdeadfsfg";
        String strB = "abcedacdre";

        int n= strA.length();
        int m = strB.length();
        System.out.println(getPrintLongestCommonSubstring(strA,strB,n,m));
    }

    private static String getPrintLongestCommonSubstring(String strA, String strB, int n, int m) {
        int maxValue = 0;
        int row =0;
        int col=0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j]>maxValue){
                        maxValue = dp[i][j];
                        row = i;
                        col = j;
                    }
                }
            }
        }

        while (row>0 && col>0){
            if(dp[row][col]==0){
                break;
            }
            stringBuilder.append(strB.charAt(row-1));
            row--;
            col--;
        }
        return stringBuilder.reverse().toString();
    }
}
