package org.example;

import java.util.HashSet;

public class Detect_Remove_Cycle {
    public static void removeLoop(Node head){

        HashSet<Node>set = new HashSet<>();

        // pointer to previous node
        Node prev = null;
        while(head != null){

            // if node is not present in the map then insert
            if(!set.contains(head)){
                set.add(head);
                prev = head;
                head = head.next;
            }else {
                // the head is already present then it crate the loop then
                // last nodes next pointer null

                prev.next = null;
                break;
            }
        }
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

    }
}
