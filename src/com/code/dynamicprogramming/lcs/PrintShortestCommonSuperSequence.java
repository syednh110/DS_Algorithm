package com.code.dynamicprogramming.lcs;

public class PrintShortestCommonSuperSequence {
    static int[][] dp= new int[1000][1000];
    public static void main(String[] args) {
        String strA = "abcdaf";
        String strB = "acbcf";

        int n= strA.length();
        int m = strB.length();
        System.out.println(getPrintShortestCommonSuperSequence(strA,strB,n,m));
    }

    private static String getPrintShortestCommonSuperSequence(String strA, String strB, int n, int m) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(strA.charAt(i-1)==strB.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        while (n>=0 && m>=0){
            if(dp[n][m]==0){
                break;
            }
            if(strA.charAt(n-1)==strB.charAt(m-1)){
                stringBuilder.append(strB.charAt(m-1));
                n--;
                m--;
            }
            else {
                if (dp[n-1][m]<dp[n][m-1]){
                    stringBuilder.append(strB.charAt(m-1));
                    m--;
                }
                else{
                    stringBuilder.append(strA.charAt(n-1));
                    n--;
                }
            }
        }
        return stringBuilder.reverse().toString();
    }

}
