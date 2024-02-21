package com.code.lambdasstreams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given an array of strings strs , group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
// Sol1 :-
    // vis[] =
public class ProblemOne {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = findAnagram(strs);

        for (List<String> s: ans){
            System.out.println(s);
        }
    }

    private static List<List<String>> findAnagram(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visit = new boolean[strs.length];

        for(int i =0;i< strs.length;i++){
            if(visit[i])
                continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            for (int j=i+1;j< strs.length;j++){
                if(!visit[j]){
                    if(checkAnagram(strs[i],strs[j])){
                        temp.add(strs[j]);
                        visit[j] = true;
                    }
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    private static boolean checkAnagram(String str, String str1) {
        int[] freq = new int[26];
        if(str.length()!=str1.length())
            return false;
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
            freq[str1.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }
}
