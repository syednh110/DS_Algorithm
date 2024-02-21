package com.code.dynamicprogramming.lcs;

public class LongestRepeatingSubsequence {

    static int[][] dp = new int[1000][1000];
    public static void main(String[] args) {
        String str = "aabcbdedbba";
        //"abbdedbcbaa"

        System.out.println("Length of longest repeating subsequence : "+getLongestRepeatingSubsequence(str,str,str.length(),str.length()));

    }

    private static int getLongestRepeatingSubsequence(String strA, String strB, int n, int m) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1) && i!=j){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
