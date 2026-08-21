package org.example;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class Deleting_without_head_pointer {

    public static void deleteNode(Node x){
      Node temp = x.next;
      x.data = temp.data;
      x.next = temp.next;

    }

    public static void printList(Node head){
       while (head != null){

          System.out.print(head.data);

          if(head.next != null){
              System.out.print(" -> ");
          }
           head = head.next;
       }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(4);
        head.next.next.next = new Node(30);

        Node x = head.next;

        deleteNode(x);
        printList(head);
    }
}
