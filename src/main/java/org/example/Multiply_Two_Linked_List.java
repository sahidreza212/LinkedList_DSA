package org.example;

public class Multiply_Two_Linked_List {
   public static final long MOD = 10000000007;

   public static long multiplyTwoList(Node first,  Node second){

       long num1 = 0, num2 = 0;

       // Travers the first linkedList and construct the first number
       while(first != null){
           num1 = num1 * 10 + first.data;
           first = first.next;
       }
       // Travers the second linkedList and construct the second number
       while(second != null){
           num2 = num2 * 10 + second.data;
           second = second.next;
       }
       // return the product modulo MOD
       return (num1 * num2) % MOD;

   }

    public static void main(String[] args) {

       Node first = new Node(9);
       first.next = new Node(4);
       first.next.next = new Node(6);

       Node second = new Node(8);
       second.next = new Node(4);

        System.out.print(multiplyTwoList(first,second));
    }
}
