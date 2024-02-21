package com.code.recursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
// Implementation of StackSort Using Recursion
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        SortStack sortStack = new SortStack();
        System.out.println("Stack After Sorting ----------");
        sortStack.getSortedStack(stack);
        for (Integer a:stack){
            System.out.print(" " +a);
        }




// Implementation of ArraySort using recursion
        System.out.println();
        System.out.println("Array After Sorting  ----------");
        int arr[] = {5,8,1,4,7,2};
        int size = arr.length;
        SortArray sortArray = new SortArray();
        sortArray.getSortedArray(arr,size);
        for (Integer x:arr){
            System.out.print(" "+x);
        }


//Implementation of reverse Stack using recursion
        System.out.println();
        System.out.println("Reverse Stack ----------");
        Stack<Integer> stackNew = new Stack<>();
        stackNew.push(3);
        stackNew.push(2);
        stackNew.push(7);
        stackNew.push(5);
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.getReverseStack(stackNew);
        for (Integer x: stackNew){
            System.out.print(" "+x);
        }

//Implementation of reverse Stack using recursion
        System.out.println();
        System.out.println("Delete element from stack  ----------");
        DeleteKthElementFromStack deleteKthElementFromStack = new DeleteKthElementFromStack();
        deleteKthElementFromStack.getDeleteKthElementFromStack(stackNew,3);
        for (Integer x: stackNew){
            System.out.print(" "+x);
        }
    }
}
