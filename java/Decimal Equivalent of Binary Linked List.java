/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */

class Solution
{
   long DecimalValue(Node head)
   {
       long res =0;
       int mod = 1000000007;
       while(head!=null){
           res = (res<<1)%mod;
           res = (res + head.data)%mod;
           head = head.next;
       }
       return res;
     
   }
}