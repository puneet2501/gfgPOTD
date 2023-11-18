/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp=head;
    Node prev=null;
    Node next=null;
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        temp.prev=next;
        prev=temp;
        temp=next;
    }
    return prev;
}