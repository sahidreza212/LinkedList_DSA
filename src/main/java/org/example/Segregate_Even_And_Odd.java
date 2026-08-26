package org.example;

public class Segregate_Even_And_Odd {
    public static Node divideNode(Node head) {

        // Create the new even list
        Node resStart = null;
        Node resEnd = null;

        Node curr = head;
        Node prev = null;

        while (curr != null) {

            if (curr.data % 2 == 0) {

                // remove the even node to the new list
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    // if the even node is the head
                    head = curr.next;
                }
                // add the current even number to the result list
                if (resStart == null) {
                    resStart = curr;
                    resEnd = resStart;
                } else {
                    resEnd.next = curr;
                    resEnd = resEnd.next;
                }

                curr = curr.next;
            }else{
              prev = curr;
              curr = curr.next;
            }
       }

        if(resStart == null){
            return  head;
        }

        resEnd.next = head;
        return resStart;

    }

    public static void main(String[] args) {

        // Creating linked list: 17->15->8->9->2->4->6
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(6);

        head = divideNode(head);

        Node curr = head;
        while (curr!= null) {
            System.out.print(curr.data);
            if (curr.next!= null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}
