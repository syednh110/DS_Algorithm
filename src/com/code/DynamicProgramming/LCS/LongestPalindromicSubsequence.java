package com.code.DynamicProgramming.LCS;

public class LongestPalindromicSubsequence {
    static int[][] dp = new int[1000][1000];
    public static void main(String[] args) {
        String str = "aabcbdedbba";
        //"abbdedbcbaa"
        String strRev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        System.out.println(getLCSPalindromicSubsequenceRecursion(str,strRev,n,n));
        System.out.println(getLCSMemorization(str,strRev,n,n));
        System.out.println(getLCSTopDown(str,strRev,n,n));
    }

    private static int getLCSPalindromicSubsequenceRecursion(String str, String strRev, int n,int m) {
        if(n==0 || m==0)
            return 0;
        if(str.charAt(n-1)==strRev.charAt(m-1)){
            return 1+ getLCSPalindromicSubsequenceRecursion(str,strRev,n-1,m-1);
        }
        else {
            return Math.max(getLCSPalindromicSubsequenceRecursion(str,strRev,n-1,m),getLCSPalindromicSubsequenceRecursion(str,strRev,n,m-1));
        }
    }
    private static int getLCSTopDown(String strA, String strB, int n, int m) {
        int[][] dp1 = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1)){
                    dp1[i][j] = 1 + dp1[i-1][j-1];
                }
                else{
                    dp1[i][j] = Math.max(dp1[i-1][j],dp1[i][j-1]);
                }
            }
        }
        return dp1[n][m];
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
}
