package com.code.recursion;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
        public static void main(String[] args){
            List<Integer> list= new LinkedList<>();
            findPrimeFactor(list,315,2);
            System.out.println(list);
        }

        public static void findPrimeFactor(List<Integer> list,int n,int m){
            if(n==1)
                return;
            else if(n%m==0){
                list.add(m);
                findPrimeFactor(list,n/m,m);
            }
            else{
                findPrimeFactor(list,n,m+1);
            }
        }
}
