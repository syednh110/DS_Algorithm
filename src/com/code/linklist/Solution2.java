package com.code.linklist;

public class Solution2 {
    public static Node reverseKGroup(Node head, int k) {
        int len = findLength(head);
        if(len<k)
            return head;
        int i=0;
        Node next = null;
        Node curr = head;
        Node prev = null;
        while(i<k && curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(curr!=null){
            head.next = reverseKGroup(curr,k);
        }
        return prev;
    }
    private static int findLength(Node head){
        Node t = head;
        int count =0;
        while(t!=null){
            count++;
            t = t.next;
        }
        return count;
    }
}
