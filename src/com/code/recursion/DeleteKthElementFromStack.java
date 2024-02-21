package com.code.recursion;

import java.util.Stack;

public class DeleteKthElementFromStack {
    public void getDeleteKthElementFromStack(Stack<Integer> stack,int k){
        if(stack.empty()){
            return;
        }
        solve(stack,k);
        return;
    }

    private void solve(Stack<Integer> stack, int k) {
        if(k==1){
            stack.pop();
            return;
        }
        int val = stack.pop();
        solve(stack,k-1);
        stack.push(val);
    }
}
