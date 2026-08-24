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
    public static void main(String[] args) {

    }
}
