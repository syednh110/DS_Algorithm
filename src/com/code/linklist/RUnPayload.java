package com.code.linklist;

public class RUnPayload implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Hello "+ Thread.currentThread());
        }
    }
}
