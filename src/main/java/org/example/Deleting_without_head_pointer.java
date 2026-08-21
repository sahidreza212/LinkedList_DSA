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
    public static void main(String[] args) {


    }
}
