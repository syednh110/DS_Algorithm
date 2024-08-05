package com.code.linklist;

import java.util.*;

public class StringLength {
    //String[]
//    There is a list with 100 Strings. How to find String with maximum length?
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("axz");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        int max = 0;
        String ans = "";
        for(String x:list){
            if(x.length()>max){
                max = x.length();
                ans = x;
            }
        }
        System.out.println(ans);
//        int max = 0;

        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).orElse(null));

//        OptionalInt maxElement = list.stream().mapToInt(String::length).max();
//        System.out.println(list.stream().filter(s -> s.length() == maxElement.getAsInt()).findAny());



    }


}
