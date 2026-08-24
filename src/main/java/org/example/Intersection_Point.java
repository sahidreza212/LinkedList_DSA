package org.example;

public class Intersection_Point {
    public static Node intersectionPoint(Node head1, Node head2){

        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {

        // First list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // Second list: 3 -> 6 -> 9
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // Create intersection
        // 3 -> 6 -> 9 -> 15 -> 30
        head2.next.next.next = head1.next;

        // Find intersection point
        Node intersectionPoint = intersectionPoint(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("-1");
        } else {
            System.out.println(intersectionPoint.data);
        }
    }
}
