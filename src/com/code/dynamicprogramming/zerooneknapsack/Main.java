package com.code.dynamicprogramming.zerooneknapsack;

public class Main {
    public static void main(String[] args) {
        int val[] = {6,7,5,8,3};
        int wt[] = {4,1,5,3,2};
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int ans = zeroOneKnapsack.getSubSumRecursion(val,wt,35,4);
        System.out.println(ans);
    }
}
