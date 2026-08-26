package org.example;

public class Delete_Node_With_Greater_Value_In_Right_Side {

    public static Node computeNode(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node nextNode = computeNode(head.next);

        if(nextNode.data > head.data){
            return nextNode;
        }
        head.next = nextNode;
        return head;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {

        // Create linked list
        // 12->15->10->11->5->6->2->3
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);

        head = computeNode(head);

        printList(head);
    }
}
