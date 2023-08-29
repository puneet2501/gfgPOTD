class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	    if(x==1) return head.next;
	    
	    Node node = head;
	    while(node.next!=null){
	        if(x==2){
	            node.next = node.next.next;
	            break;
	        }
	        node = node.next;
	        x--;
	    }
	    
	    return head;
    }
}