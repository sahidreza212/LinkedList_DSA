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

    public static Node1 split(Node1 head){
        // check if the list is empty or not
        if(head == null || head.arbit == null){
            return null;
        }

        Node1 slow = head;
        Node1 fast = head.arbit;

        // move slow and fast pointer to find the middle
        while(fast != null || fast.arbit != null){
            slow = slow.arbit;
            fast = fast.arbit.arbit;
        }

        // split the list into two
        Node1 second = slow.arbit;
        slow.arbit = null;
        return second;
    }

    public static Node1 MergeSort(Node1 head) {
        // check if the list is empty or having only one node
        if(head == null || head.arbit == null){
            return null;
        }
        // Split the list into two list
        Node1 left = head;
        Node1  right = split(head);

        // Recursively sort the both halves
        left = MergeSort(left);
        right = MergeSort(right);

        // Merge the two list
        return SortedMerge(left,right);
    }


    public static Node1 populateArbit(Node1 head){
        Node1 curr = head;
        // Initialize the arbit to the next node
        while(curr != null){
            curr.arbit = curr.next;
            curr = curr.next;
        }
        // Sort the list using arbit point
        return MergeSort(head);
    }



    public static void main(String[] args) {

        // Create a hardcoded linked list
        // List: 5 -> 10 -> 2 -> 3
        Node1 head = new Node1(5);
        head.next = new  Node1(10);
        head.next.next = new Node1(5);
        head.next.next.next = new Node1(3);

    }
}
