package com.code.interview;




public class StrinConvert {
    public static void main(String[] args) {
        String str = "[ab]3[c]11[ec]2";
        System.out.println(convertStr(str));
    }

    private static String convertStr(String str) {
        int i=0;
        boolean flag = true;
        boolean find = false;
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder() ;
        StringBuilder num = new StringBuilder();
        while(i<str.length()){
            if(find){
//                String subAns = findAnswer(temp,num);
                String t = temp.toString().repeat(Integer.parseInt(num.toString()));
                ans.append(t);
            }
            char c = str.charAt(i);
            if(c=='['){
                flag = true;
                i++;
                continue;
            }
            if(c==']'){
                flag = false;
                i++;
                continue;
            }


            if(flag){
                temp = new StringBuilder();
                while(i<str.length() && str.charAt(i) != ']'){
                     temp.append(str.charAt(i++));
                }
            }
            else{
                num = new StringBuilder();
                while(i<str.length() && str.charAt(i)!='['){
                    num.append(str.charAt(i++));
                }
            }
        }
        return ans.toString();
    }


}
