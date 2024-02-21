package com.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] arr = {1,2,3};
        int target = 5;
        findCombination(lists,arr,new ArrayList<>(),target,0);
        for (List<Integer> list:lists){
            System.out.println(list);
        }
    }

    private static void findCombination(List<List<Integer>> lists, int[] arr,ArrayList<Integer> path, int target, int start) {
        if(target<0) return;
        else if (target==0) lists.add(new ArrayList<>(path));
        else{
            for (int i=start;i<arr.length;i++){
                path.add(arr[i]);
                findCombination(lists,arr,path,target-arr[i],i);
                path.remove(path.size()-1);
            }
        }
    }
}
