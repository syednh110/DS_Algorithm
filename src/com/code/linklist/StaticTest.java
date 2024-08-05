package com.code.linklist;

public class StaticTest {
    static int i;
    static {
        i =10;
    }
}
class Main2{
    public static void main(String[] args) {

        StaticTest s = new StaticTest();
        System.out.println(s.i);
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
    }
}
