package com.code.linklist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {

    public static void main(String[] args) {
//        List<Orders> list = order1, order3, order5;
//        List<Orders> list2 = order3, order7, order9;
//        List<Orders> list3 = order2, order3, order5;
//
//         Stream.of(list,list2,list3).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();

        List<Integer> ans = myList.stream().filter(e-> !set.add(e)).toList();
        System.out.println(ans);

        List<String> ans2 = myList.stream().map(e-> e+"").filter(s-> s.charAt(0)=='1').toList();
        System.out.println(ans2);
    }
}
