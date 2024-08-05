package com.code.stack;


import javax.xml.stream.events.Characters;

public class DecodeString {
    public static void main(String[] args) {
        String str = "a3b13c2";
        System.out.println(decodeStrings(str));
    }

    private static String decodeStrings(String str) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        StringBuilder temp = new StringBuilder();
        while (i < str.length()) {
            while (i < str.length() && Character.isAlphabetic(str.charAt(i))) {
                temp.append(str.charAt(i));
                i++;
            }
            String sub = temp.toString();
            temp = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
                i++;
            }
            int num = Integer.parseInt(temp.toString());
            while (num > 0) {
                ans.append(sub);
                num--;
            }

        }
        return ans.toString();
    }
}
