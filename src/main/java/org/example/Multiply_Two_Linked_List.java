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
   }

    public static void main(String[] args) {

    }
}
