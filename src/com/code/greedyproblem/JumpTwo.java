package com.code.greedyproblem;

public class JumpTwo {
    public static void main(String[] args) {
        int[] nums = {3,2,1,1,4};
        int jump = findMinJump(nums);
        System.out.println(jump);
    }

    private static int findMinJump(int[] nums) {
        int size = nums.length;
        int currentReach = 0;
        int maxReach = 0;
        int jump=0;
        for(int i=0;i<size;i++){
            if(maxReach<nums[i]+i)
                maxReach = nums[i]+i;
            if(currentReach==i){
                jump++;
                currentReach = maxReach;
            }
            if(currentReach>=size-1)
                break;
        }
        return jump;
    }
}
