package com.code.DynamicProgramming.LCS;

import java.util.Arrays;

public class LongestCommonSubstring {

    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "aabcdeadfsfg";
        String strB = "abcedacdre";

        int n= strA.length();
        int m = strB.length();
        System.out.println(getLCSRecursion(strA,strB,n,m,0));

        System.out.println(getLCSMemorization(strA,strB,n,m,0));

        Arrays.stream(dp).forEach(x -> Arrays.fill(x,0));

        System.out.println(getLCSTopDown(strA,strB,n,m));


    }

    private static int getLCSTopDown(String strA, String strB, int n, int m) {
        int ans = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    private static int getLCSMemorization(String strA, String strB, int n, int m,int count) {
        if(n==0 || m==0)
            return count;
        if(dp[n][m]!=0) {
            return dp[n][m];
        }
        else if (strA.charAt(n-1)==strB.charAt(m-1)) {
            return dp[n][m] = getLCSMemorization(strA,strB,n-1,m-1,count+1);
        }
        else{
            return dp[n][m] = Math.max(count,Math.max(getLCSRecursion(strA,strB,n-1,m,0),getLCSRecursion(strA,strB,n,m-1,0)));
        }
    }

    private static int getLCSRecursion(String strA, String strB, int n, int m,int count) {
        if(n==0 || m==0)
            return count;
        if(strA.charAt(n-1)==strB.charAt(m-1)) {
            return getLCSRecursion(strA,strB,n-1,m-1,count+1);
        }
        else
            return Math.max(count,Math.max(getLCSRecursion(strA,strB,n-1,m,0),getLCSRecursion(strA,strB,n,m-1,0)));
    }
}
