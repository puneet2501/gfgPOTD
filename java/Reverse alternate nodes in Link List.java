class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd.next==null || odd.next.next==null) return;
        
        Node pre = null;
        while(odd.next!=null && odd.next.next!=null){
            Node curr = odd.next;
            odd.next = curr.next;
            curr.next = pre;
            pre = curr;
            odd = odd.next;
        }
        if(odd.next==null) odd.next = pre;
        else odd.next.next = pre;
        
    }
}