package com.code.dynamicprogramming.zerooneknapsack;

public class ZeroOneKnapsack {
    int[][] dp = new int[1000][1000];
    //Recursion Implementation
    public static void main(String[] args) {
        int val[] = {6,7,5,8,3};
        int wt[] = {4,1,5,3,2};
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int ans = zeroOneKnapsack.getSubSumRecursion(val,wt,29,5);
        System.out.println(ans);
        System.out.println(zeroOneKnapsack.getSubSumMemorization(val,wt,29,5));
        System.out.println(zeroOneKnapsack.getSubSumDP(val,wt,29,5));
    }
    public int getSubSumRecursion(int[] val,int[] weight,int target,int n){
        if(n==0 || target==0){
            return 0;
        }
        if(weight[n-1]<=target){
            return Math.max(val[n-1]+getSubSumRecursion(val,weight,target-weight[n-1],n-1),getSubSumRecursion(val, weight, target, n-1));
        }else {
            return getSubSumRecursion(val,weight,target,n-1);
        }
    }

    //Memorization
    public int getSubSumMemorization(int[] val,int[] weight,int target,int n){
        if(n==0 || target==0){
            return 0;
        }
        if(dp[n][target]!=0)
            return dp[n][target];
        if(weight[n-1]<=target){
            return dp[n][target]=Math.max(val[n-1]+getSubSumRecursion(val,weight,target-weight[n-1],n-1),getSubSumRecursion(val, weight, target, n-1));
        }else {
            return dp[n][target]=getSubSumRecursion(val,weight,target,n-1);
        }
    }

    //DP Implementation
    public int getSubSumDP(int[] val,int[] weight,int target,int n){
        int[][] dp1 = new int[n+1][target+1];


        for (int i=0;i<=n;i++){
            for (int w=0;w<=target;w++){
                if(i==0 || w==0){
                    dp1[i][w] = 0;
                }
                else if(weight[i-1]<=w){
                    dp1[i][w] = Math.max(val[i-1]+dp1[i-1][w-weight[i-1]],dp1[i-1][w]);
                }else {
                    dp1[i][w] = dp1[i-1][w];
                }
            }
        }
        return dp1[n][target];
    }

}
