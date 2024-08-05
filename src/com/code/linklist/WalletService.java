package com.code.linklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletService {
//    List<Long> currencyLists = new ArrayList<>();
    Map<Long,Integer> currencyFrequency = new HashMap<>();
    public long balance() {
        long sumAmount = 0;
        for(Map.Entry<Long,Integer> m: currencyFrequency.entrySet()){
            sumAmount+=m.getKey()*m.getValue();
        }
        return sumAmount;
    }


    public String add(Map<Long, Integer> currency) {
        try{
            for(Map.Entry<Long,Integer> m: currency.entrySet()){
                currencyFrequency.put(m.getKey(),currencyFrequency.getOrDefault(m.getKey(),0)+m.getValue());
            }
            return "Money added successfully";
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public long withdraw(long currency) {
        try{
            long withdrawamount = currencyFrequency.get(currency);
            currencyFrequency.put(currency,currencyFrequency.get(currency)-1);
            return withdrawamount;
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
