package com.code.DynamicProgramming.LCS;

public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        String str = "aabcbdedbba";
        //"abbdedbcbaa"
        String strRev = new StringBuilder(str).reverse().toString();
        int n = str.length();
        System.out.println(getLCSPalindromicSubsequenceRecursion(str,strRev,n,n));
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
}
