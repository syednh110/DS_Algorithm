package com.code.dynamicprogramming.lcs;

public class LongestPalindromicSubstring {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "aabcbdedbba";
        String strB = new StringBuilder(strA).reverse().toString();

        int n= strA.length();
        System.out.println(getLongestPalindromicSubstring(strA,strB,n,n));

    }

    private static int getLongestPalindromicSubstring(String strA, String strB, int n, int m) {
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
}
