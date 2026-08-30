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

        // process the node until all are added to the result node
        while(front != null && last != null && front != last && last.next != front){
            Node2 newNode;

            // Compare the value of the front and last node
            if(front.data < last.data){
                newNode = new Node2(front.data);
                front = front.next;
            }else {
                newNode = new Node2(last.data);
                last = last.prev;
            }

            // add the node to the result
            if(result == null){
                result = newNode;
                tail = result;
            }else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = tail.next;
            }
        }

        // Handle the case where front and last pointers
        // meet or cross
        while(front != null && front != last.next){
            Node2 newNode = new Node2(front.data);
            front = front.next;
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        while(last != null && last.next != front){
            Node2 newNode = new Node2(last.data);
            last = last.prev;
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        return result;
    }
    static void printList(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Create the doubly linked list: 2<->12<->11<->1
        Node2 head = new Node2(2);
        head.next = new Node2(12);
        head.next.prev = head;
        head.next.next = new Node2(11);
        head.next.next.prev = head.next;
        head.next.next.next = new Node2(1);
        head.next.next.next.prev = head.next.next;

        Node2 sortedHead = sortBiotonicDLL(head);
        printList(sortedHead);

    }
}
