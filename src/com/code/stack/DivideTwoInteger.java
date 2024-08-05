package com.code.stack;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DivideTwoInteger {
    static StringBuilder ans = new StringBuilder();
    static Map<Integer,Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        long a = 22;
        long b = -7;
        boolean flag = true;
//        System.out.println(divideInteger(a,b,flag));
        System.out.println(divideIntegerIterativeWay(a,b));
    }

    private static String divideIntegerIterativeWay(long a, long b) {
        StringBuilder ans = new StringBuilder();

        if(b==0)
            return "Undefine";
        if(a<0 && b>0 || b<0 && a>0)
            ans.append('-');
        a = Math.abs(a);
        b = Math.abs(b);

        ans.append(a/b);
        long remainder = a%b;
        if(remainder==0)
            return ans.toString();

        ans.append('.');
        Map<Long,Integer> map = new HashMap<>();
        while(remainder!=0){
            if(map.containsKey(remainder)){
                int index = map.get(remainder);
                ans.insert(index,"[");
                ans.append("]");
                break;
            }
            map.put(remainder,ans.length());
            remainder*=10;
            ans.append(remainder/b);
            remainder %=b;

        }
          return ans.toString();
    }


    private static String divideInteger(Integer a, Integer b, boolean flag) {
        if(a==0){
            return ans.toString();
        }

        if(flag){
           ans.append(a/b);
           if(a/b==0 && a%b!=0){
               flag = false;
               ans.append('.');
               divideInteger(a*10,b,flag);
           }
           else{
               divideInteger(a%b,b,flag);
           }
        }
        else{
            if(map.containsKey(a)){
                int index = map.get(a);
                ans.insert(index,"[");
                ans.append("]");
                return ans.toString();
            }
            map.put(a,ans.length());
            ans.append(a/b);
            a%=b;
            divideInteger(a*10,b,flag);
        }
        return ans.toString();
    }

}
