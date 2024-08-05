package com.code.recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(1);
        System.out.println(stack);
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.getReverseStack(stack);
        System.out.println(stack);
    }

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

    private void reverseStack(Stack<Integer> stack, int temp) {
        if(stack.empty()){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertElementInStack(stack,val);
        stack.push(val);
    }
}
