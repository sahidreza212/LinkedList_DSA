package org.example;


public class Remove_Duplicates {

    public static Node deleteDuplicates(Node head){
        if(head == null){
            return head;
        }
        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            boolean duplicate = false;
            Node temp = head;

            while(temp != curr){
                if(temp.data == curr.data){
                    duplicate = true;
                    break;
                }
                temp = temp.next;
            }
            if(duplicate){
                prev.next = curr.next;
                curr = prev.next;
            }else {
                prev = curr;
                curr = curr.next;
            }
        }
        return  head;
    }
    public static void main(String[] args) {

    }

}
