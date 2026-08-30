package org.example;

public class Rearrange_LL_Alternate_First_And_Last {

    public static Node reverseList(Node node){
        Node prev = null;
        Node curr = node , next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public static void main(String[] args) {

        // singly linked list 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
    }
}
