package com.code.linklist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    //String value = "jdshdkjsahbgjk"
    //Print second most repeated char and how many times it is repeated



    public static void main(String[] args) throws InterruptedException {
        String value = "jdshdkjsahbgjk";
//        findmaxFreq(value);
        findDublicateFreq(value);

//        Thread t1 = new Thread(() ->{
//            for(int i=0;i<10;i++){
//                System.out.println("Hi "+ Thread.currentThread());
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for(int i=0;i<100;i++){
//                System.out.println("Hello "+ Thread.currentThread());
//            }
//        });
//
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();


    }

    private static void findDublicateFreq(String value) {
        Arrays.stream(value.split("")).collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting())).entrySet()
                .stream().filter(e->e.getValue()==2).forEach(System.out::println);
    }

    private static void findmaxFreq(String value) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<value.length();i++){
            char c = value.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        char ansF ='a';
        char ansS = 'a';

//        Map<Character,Integer> ans = new HashMap<>();
        for(Map.Entry<Character,Integer> m :map.entrySet()){
            if(m.getValue()>first) {
                second = first;
                ansS = ansF;
                first = m.getValue();
                ansF = m.getKey();

            }
            else{
                if(m.getValue()>second){
                    second = m.getValue();
                    ansS = m.getKey();
                }
            }
        }
        System.out.println( ansS+" "+second);
        for(Map.Entry<Character,Integer> m :map.entrySet()){
            if(m.getValue()==second){
                System.out.println(m);
            }
        }


    }

}
