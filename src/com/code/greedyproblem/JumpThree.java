package com.code.greedyproblem;

public class JumpThree {
    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;
        if(canReach(arr,start)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not available");
        }

    }
    public static boolean canReach(int[] arr, int start) {
        boolean[] vis = new boolean[arr.length];
        if(findZero(arr,vis,start)){
            return true;
        }
        return false;
    }
    public static boolean findZero(int[] arr, boolean[] vis,int start){
        if(arr[start]==0){
            return true;
        }
        vis[start] = true;
        if(start - arr[start]>=0){
            if(!vis[start-arr[start]] && findZero(arr,vis,start-arr[start])){
                return true;
            }
        }
        if((arr[start]+start < arr.length)){
            if(!vis[arr[start]+start] && findZero(arr,vis,arr[start]+start)){
                return true;
            }
        }
        return false;
    }
}
