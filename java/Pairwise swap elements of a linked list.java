class Solution {
    
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null) return head;
        
        Node temp = head.next;
        head.next = pairwiseSwap(temp.next);
        temp.next = head;
        
        return temp;
    }
}