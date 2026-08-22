package org.example;

public class Sort_LinkedList {

    public static void sortList(Node head){

        int []count = {0,0,0};
        Node ptr = head;

        // count the frequency of each element
        while(ptr != null){
            count[ptr.data] += 1;
            ptr = ptr.next;
        }

        int idx = 0;
        ptr = head;

        // put the all element in the sort order
        while( ptr != null){
            if(count[idx] == 0){
                idx += 1;
            }else {
                ptr.data = idx;
                count[idx] -= 1;
                ptr = ptr.next;
            }
        }
    }

    public static void main(String[] args) {

    }
}
