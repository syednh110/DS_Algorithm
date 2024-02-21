package com.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] nums = {1,2,3};
        int target  = 5;
        backtraking(lists,nums,new ArrayList<>(),target,0);
        for (List<Integer> list:lists){
            System.out.println(list);
        }
    }

    private static void backtraking(List<List<Integer>> lists, int[] nums, ArrayList<Integer> path, int target, int start) {
        if(target<0) return;
        else if(target==0) lists.add(new ArrayList<>(path));
        else{
            for (int i=start;i<nums.length;i++){
                if(i>start && nums[i]==nums[i-1])continue;
                path.add(nums[i]);
                backtraking(lists,nums,path,target-nums[i],i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
