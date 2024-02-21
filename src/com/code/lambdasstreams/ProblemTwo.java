package com.code.lambdasstreams;

/**
 * Input: head = 1-->2-->3-->4-->5, k = 3
 * Output: 3-->4-->5-->1-->2
 */
//Sol :- size = 5
    // size - k = 5 - 3 =2
    // 1-->2

class List{
    public int val;
    public List next;
    public List(int val){
        this.val = val;
        //this.next = null;
    }
}
public class ProblemTwo {

    public static void main(String[] args) {
        //Create List
        List first = new List(1);
        List second = new List(2);
        first.next = second;
        List third = new List(3);
        second.next = third;
        List fourth = new List(4);
        third.next = fourth;
        List fifth = new List(5);
        fourth.next = fifth;

        List returnAns = findNewList(first,10);
        while (returnAns!=null){
            System.out.print(returnAns.val+"-->");
            returnAns = returnAns.next;
        }
    }

    private static List findNewList(List first,int k) {

        int count = 0;
        List temp = first;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        k = k%count;
        if(k==0)
            return first;
        int newSize = count - k;
        List newHeader = first;
        for(int i=0;i<newSize;i++){
            newHeader = newHeader.next;
        }

        temp = first;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        temp.next = first;
        List toremove = first;
        for(int i=0;i<newSize-1;i++){
            toremove = toremove.next;
        }
        toremove.next = null;
        return newHeader;
    }
}
