package com.code.linklist;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccoiliteTest {
    //int[] arr = {2,-1,4,7,9,-10,-1,2}
    // 2 4 7 9 2 -1 -10 -1
    // String name = "namdar";

    public static void main(String[] args) {
        int[] arr = {2,-1,4,7,0,-1,2,-7};
//        sortAccordingTo(arr);
        String name = "namdar";
        Optional<Map.Entry<String, Long>> ans = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(e->e.getValue()==1).findFirst();
        System.out.println(ans.get().getKey());
    }

    private static void sortAccordingTo(int[] arr) {
        int i=0;
        int j= arr.length-1;

        while(i<=j){
            if(arr[i]<0){
                swapArr(i,j,arr);
                j--;
            }
            else if(arr[i]>0){
                i++;
            }
            else if (arr[j]<0){
                j--;
            }
        }

        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void swapArr(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
