/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        head = rev(head);
        Node node = head;
        
        while(node!=null && node.next!=null){
            if(node.data>node.next.data) node.next = node.next.next;
            else node = node.next;
        }
        
        return rev(head);
    }
    
    Node rev(Node head){
        Node prev = null, next =null;
        
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
  
  