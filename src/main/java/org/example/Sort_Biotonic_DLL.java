package org.example;

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class Sort_Biotonic_DLL {

    // function to sort doubly linked list
    public static Node2 sortBiotonicDLL(Node2 head){

        if(head == null || head.next == null){
            return head;
        }

        // find the last
        Node2 last = head;
        while(last.next != null){
            last = last.next;
        }

        // Initialize the pointer
        Node2 front = head;
        Node2 result = null;
        Node2 tail = null;
    }
    public static void main(String[] args) {

    }
}
