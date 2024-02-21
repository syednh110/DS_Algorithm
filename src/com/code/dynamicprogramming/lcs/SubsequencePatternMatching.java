package com.code.dynamicprogramming.lcs;

public class SubsequencePatternMatching {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "axy";
        String strB = "abxdvyz";

        int n= strA.length();
        int m = strB.length();
        System.out.println("String A is subsequence of String B : "+getSubsequencePatternMatching(strA,strB,n,m));

    }

    private static boolean getSubsequencePatternMatching(String strA, String strB, int n, int m) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return Math.min(n,m) - dp[n][m]==0;
    }

}
