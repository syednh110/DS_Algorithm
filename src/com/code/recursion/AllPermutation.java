package com.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPermutation {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] arr = {1,2,3};
        boolean[] check = new boolean[arr.length];
        findpermute(lists,check,arr,new ArrayList<>());
        for (List<Integer> list:lists){
            System.out.println(list);
        }
    }

    private static void findpermute(List<List<Integer>> lists, boolean[] check, int[] arr, ArrayList<Integer> path) {
        if(path.size()==arr.length){
            lists.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(check[i]) continue;
            path.add(arr[i]);
            check[i] = true;
            findpermute(lists,check,arr,path);
            path.remove(path.size()-1);
            check[i] = false;
        }
    }
}
