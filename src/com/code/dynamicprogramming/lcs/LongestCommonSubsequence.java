package com.code.dynamicprogramming.lcs;

import java.util.Arrays;

public class LongestCommonSubsequence {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "aabcdeadfsfg";
        String strB = "abcedacdre";

        int n= strA.length();
        int m = strB.length();
        System.out.println(getLCSRecursion(strA,strB,n,m));

        System.out.println(getLCSMemorization(strA,strB,n,m));

        Arrays.stream(dp).forEach(x -> Arrays.fill(x,0));

        System.out.println(getLCSTopDown(strA,strB,n,m));

    }

    private static int getLCSTopDown(String strA, String strB, int n, int m) {
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
        return dp[n][m];
    }

    private static int getLCSMemorization(String strA, String strB, int n, int m) {
        if(n==0 || m==0)
            return 0;
        if(dp[n][m]!=0) {
            return dp[n][m];
        }
        else if (strA.charAt(n-1)==strB.charAt(m-1)) {
            return dp[n][m] = 1+ getLCSMemorization(strA,strB,n-1,m-1);
        }
        else{
            return dp[n][m] = Math.max(getLCSMemorization(strA,strB,n-1,m),getLCSMemorization(strA,strB,n,m-1));
        }
    }

    private static int getLCSRecursion(String strA, String strB, int n, int m) {
        if(n==0 || m==0)
            return 0;
        if(strA.charAt(n-1)==strB.charAt(m-1))
            return 1+ getLCSRecursion(strA,strB,n-1,m-1);
        else
            return Math.max(getLCSRecursion(strA,strB,n-1,m),getLCSRecursion(strA,strB,n,m-1));
    }
}
