package com.code.linklist;
class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Solution {
    public static Node getListAfterReverseOperation(Node head, int n, int[] b) {
        return reverseList(head,n,b,0);
    }

    public static Node reverseList(Node head, int n, int[] b, int index){
        int len = findLength(head);
        if(index>=n || len<b[index])
            return head;
        Node next = null;
        Node curr = head;
        Node prev = null;
        int i=0;
        while(i<b[index] && curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        if(curr!=null){
            head.next = reverseList(curr,n,b,index+1);
        }
        return prev;
    }

    public static int findLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
