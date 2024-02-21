package com.code.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Combinatorial {
    public static void main(String[] args) {
        int n = 3;
        List<String> res = letterCombination(n);

        System.out.println(res);
    }

    private static List<String> letterCombination(int n) {
        List<String>  list = new ArrayList<>();
        dfs(n,list,0,new ArrayList<>());
        return list;
    }

    private static void dfs(int n, List<String> list, int start, ArrayList<Character> path) {
        if(start==n){
            list.add(path.stream().map(Object::toString).collect(Collectors.joining()));
            return;
        }
        for(char letter: new char[]{'a','b'}){
            path.add(letter);
            dfs(n,list,start+1,path);
            path.remove(start);
        }

    }
}
