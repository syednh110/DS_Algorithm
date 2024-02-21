package com.code.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Subset1 subsets = new Subset1();
        List<List<Integer>> lists=subsets.subsets(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> templist, int[] nums, int start) {
        list.add(new ArrayList<>(templist));
        for(int i=start;i<nums.length;i++){
            templist.add(nums[i]);
            backtrack(list,templist,nums,i+1);
            templist.remove(templist.size()-1);
        }
    }

}
