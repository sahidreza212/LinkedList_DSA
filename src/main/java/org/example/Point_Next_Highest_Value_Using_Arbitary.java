package org.example;

class Node1{
    int data;
    Node1 next;

    // Pointer to next higher node
    Node1 arbit;

    Node1(int x) {
        data = x;
        next = null;
        arbit = null;
    }
}
public class Point_Next_Highest_Value_Using_Arbitary {


    public static void main(String[] args) {

        // Create a hardcoded linked list
        // List: 5 -> 10 -> 2 -> 3
        Node1 head = new Node1(5);
        head.next = new  Node1(10);
        head.next.next = new Node1(5);
        head.next.next.next = new Node1(3);

    }
}
