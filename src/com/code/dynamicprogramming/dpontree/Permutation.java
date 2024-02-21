package com.code.dynamicprogramming.dpontree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Permutation {

    void allPerm(Integer[] nums) {
        int s = nums.length;
        Set<Integer[]> set = new HashSet<>();


        for (int i = 0; i < s - 1; i++) {
            for(int j=0;j<s;j++){
                Integer[] temp = Arrays.copyOf(nums,s);
                swap(nums, i, j);

                set.add(temp);
            }

        }

        for (Integer[] t:set){
//            Arrays.stream(t).forEach(System.out::println);
            System.out.println(Arrays.toString(t));
        }


    }

    void swap(Integer[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

    }

}