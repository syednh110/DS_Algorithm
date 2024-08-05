package com.code.linklist;

import java.util.HashMap;
import java.util.Map;

public class Wallet {

    WalletService walletService = new WalletService();

    public long checkBalance(){
        return walletService.balance();
    }

    public String addMoney(long... currency ){
        Map<Long,Integer> map = new HashMap<>();
        for(long c: currency){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return walletService.add(map);
    }

    public long withdrawMoney(long currency){
        return walletService.withdraw(currency);
    }
}
