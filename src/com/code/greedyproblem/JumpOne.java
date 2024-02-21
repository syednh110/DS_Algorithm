package com.code.greedyproblem;

class JumpOne {
    public static void main(String[] args) {
        int[] nums = {3,2,1,1,4};
        if(canJump(nums)){
            System.out.println("Sucess");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean canJump(int[] nums) {
        int size = nums.length;
        int count = 0;
        int maxReach = 0;
        for(int i=0;i<size;i++){
            if(maxReach<i)
                return false;
            if(maxReach<nums[i]+i)
                maxReach = nums[i]+i;
        }
        return true;
    }
}

