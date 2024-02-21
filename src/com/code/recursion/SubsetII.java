package com.code.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Subsets II (contains duplicates)
public class SubsetII {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        SubsetII subsetII = new SubsetII();
        List<List<Integer>> lists = subsetII.findUniqueSubset(nums);
        for (List<Integer> list:lists){
            System.out.println(list);
        }

    }

    private List<List<Integer>> findUniqueSubset(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(lists,new ArrayList<>(),nums,0);
        return lists;
    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> temp, int[] nums, int start) {
        lists.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
                continue;
            temp.add(nums[i]);
            backtracking(lists,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
