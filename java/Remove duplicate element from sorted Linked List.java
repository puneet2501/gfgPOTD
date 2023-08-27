class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	    Node node = head;
	    
	    while(node!=null && node.next!=null){
	        if(node.data==node.next.data) node.next = node.next.next;
	        else node = node.next;
	    }
	    return head;
    }
}