package com.code.recursion;

import java.util.Stack;

public class ReverseStack {

    public void getReverseStack(Stack<Integer> stack){
        if(!stack.empty()){
            int temp = stack.pop();
            getReverseStack(stack);
            insertElementInStack(stack,temp);
        }
    }

    private void insertElementInStack(Stack<Integer> stack, int temp) {
        if(stack.empty()){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertElementInStack(stack,temp);
        stack.push(val);
    }
}
