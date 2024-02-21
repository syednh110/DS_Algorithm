package com.code.dynamicprogramming.lcs;

public class MinNoOfInsertionAndDeletionToMakeAToB {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "heap";
        String strB = "pea";

        int n= strA.length();
        int m = strB.length();
        System.out.println(getMinNoOfInsertionAndDeletion(strA,strB,n,m));
    }

    private static int getMinNoOfInsertionAndDeletion(String strA, String strB, int n, int m) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return n+m-2*dp[n][m];
    }
}
