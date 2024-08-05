package com.code.stack;

public class EncodeString {
    public static void main(String[] args) {
        String str = "aabbcd";
        System.out.println(encodeString(str));
    }

    private static String encodeString(String str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                ans.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        ans.append(str.charAt(str.length()-1)).append(count);
        return ans.toString();
    }
}
