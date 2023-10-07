class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        
        Node x = new Node(key);
        if(head1.data>=key){
            x.next = head1;
            return x;
        }
        
        Node node = head1;
        while(node.next!=null){
            if(node.data<key && node.next.data>=key){
                x.next = node.next;
                node.next = x;
                return head1;
            }
            node = node.next;
        }
        node.next = x;
        
        return head1;
    }
}
