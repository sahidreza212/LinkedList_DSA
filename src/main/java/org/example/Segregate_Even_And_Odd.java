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

    }
}
