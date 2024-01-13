class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
         if(head == null || head.next == null)return head;
        
        Node t = head;
        Node cur = head.next;
        while(cur != null)
        {
            while(cur != t)
            {
                if(t.data > cur.data)
                {
                    int x = t.data;
                    t.data = cur.data;
                    cur.data = x;
                }
                t = t.next;
                
            }
            t = head;
            cur = cur.next;
        }
        return t;
    }
}