package com.code.Recursion;

import java.util.Stack;

public class SortStack {
    public void getSortedStack(Stack<Integer> stack){
        if(!stack.empty()){
            int temp = stack.pop();
            getSortedStack(stack);
            insertElementInStack(stack,temp);
        }
    }

    private void insertElementInStack(Stack<Integer> stack, int temp) {
        if(stack.empty() || stack.peek() < temp){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertElementInStack(stack,temp);
        stack.push(val);
    }
}
