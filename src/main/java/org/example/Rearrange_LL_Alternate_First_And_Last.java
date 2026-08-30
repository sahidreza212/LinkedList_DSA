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
    // Method for rearranging and merging the list
    public static Node rearrange(Node node){

        // check if the list is empty or has only one node
        if(node == null || node.next == null){
            return node;
        }
        Node slow = node;
        Node fast = node.next;

        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }

        // split the node into two node
        Node firstHalf = node;
        Node secondHalf = slow.next;
        slow.next = null;

        // reverse the secondHalf
        secondHalf = reverseList(secondHalf);

        // Merging the tow list firstHalf ans secondHalf
        Node dummy = new Node(0);
        Node curr = dummy;
        while( firstHalf != null || secondHalf != null){

            if(firstHalf != null){
                curr.next = firstHalf;
                curr = curr.next;
                firstHalf = firstHalf.next;
            }
            if(secondHalf != null){
                curr.next = secondHalf;
                curr = curr.next;
                secondHalf = secondHalf.next;
            }
        }
        return dummy.next;
    }

    static void printList(Node node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {

        // singly linked list 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = rearrange(head);
        printList(head);
    }
}
