package com.code.dynamicprogramming.lcs;

public class MinNoOfDeletionToMakePalindrome {

    static int[][] dp = new int[1000][1000];
    public static void main(String[] args) {
        String str = "aabcbdedbba";
        //"abbdedbcbaa"
        String strRev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        System.out.println("Min number of deletion to make string palindrome : "+getMinNoOfDeletionToMakePalindrome(str,strRev,n,n));
    }

    private static int getMinNoOfDeletionToMakePalindrome(String strA, String strB, int n, int m) {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if(strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return strA.length()-dp[n][m];
    }
}
