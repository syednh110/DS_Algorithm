package com.code.interview;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonElement {
    public static void main(String[] args) {
//        int[] arr1 = {1,3,4,5,7};
//        int[] arr2 = {3,7,8,5,10};
//        findUnique(arr1,arr2);
        String str = "Programming";
        AtomicInteger count = new AtomicInteger();
        AtomicInteger lastCount = new AtomicInteger();
        String c = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);



         List<String> keyString = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).toList();
         Optional<String> first = keyString.stream().findFirst();
         Optional<String> last = keyString.stream().reduce((f,s)->s);
        System.out.println(keyString.get(0));
        System.out.println(keyString.get(keyString.size()-1));
        System.out.println(c);
    }

    private static void findUnique(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int x:arr1){
            set.add(x);
        }

        for(int x: arr2){
            if(!set.add(x))
                System.out.println(x);
        }
    }
}
