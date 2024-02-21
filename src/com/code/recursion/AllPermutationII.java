package com.code.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPermutationII {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] arr = {1,1,2};
        Arrays.sort(arr);
        boolean[] check = new boolean[arr.length];
        findalluniquepermute(lists,check,arr,new ArrayList<>());
        for (List<Integer> list:lists){
            System.out.println(list);
        }
    }

    private static void findalluniquepermute(List<List<Integer>> lists, boolean[] check, int[] arr, ArrayList<Integer> path) {
        if(path.size()==arr.length){
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i<arr.length;i++){
            if(check[i] || i>0 && !check[i-1] && arr[i]==arr[i-1]) continue;
            path.add(arr[i]);
            check[i]=true;
            findalluniquepermute(lists,check,arr,path);
            path.remove(path.size()-1);
            check[i]=false;
        }
    }
}
