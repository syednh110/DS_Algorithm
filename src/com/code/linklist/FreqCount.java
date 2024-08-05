package com.code.linklist;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FreqCount {

    public static void main(String[] args) {
        String input = "Syed Namdar Hussain";
        Map<Character, Integer> map = findfrequency(input);
        //print in sorted order
//        System.out.println(map);

//        for(Map.Entry<Character,Integer> e:map.entrySet()){
//            System.out.println(e);
//        }
        map.entrySet().stream().forEach(System.out::println);

        //Department employee
        // Select e.deptId , count(e.empId) from employee as e JOIN department as d on d.deptID = e.deptID and group by d.deptID;


    }

    private static Map<Character, Integer> findfrequency(String input) {
        Map<Character,Integer> map = new TreeMap<>();
        input = input.toLowerCase();

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isAlphabetic(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        return map;
    }

//    private static boolean charIsAlphabat(char c) {
//        return c >= 'a' && c <= 'z';
//    }
}
