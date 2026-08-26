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
    }
    public static void main(String[] args) {

    }
}
