package com.code.linklist;

public class Main {
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 0 6 1 5 -1
        Node head = new Node(0);
        head.next = new Node(6);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(-1);

        int[] b = {2,3};

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = Solution.reverseList(head,2,b,0);
//        head = Solution2.reverseKGroup(head,3);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
