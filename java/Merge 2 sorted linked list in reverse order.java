/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2){
        Node n1 = reverse(node1);
        Node n2 = reverse(node2);
        
        return mergeRecur(n1,n2);
        
    }
    Node mergeRecur(Node A, Node B){
 
        if (A == null) return B;
        if (B == null) return A;
 
        if (A.data > B.data) {
            A.next = mergeRecur(A.next, B);
            return A;
        }
        else {
            B.next = mergeRecur(A, B.next);
            return B;
        }
    }
    
    Node reverse(Node node){
        Node prv = null;
        Node cur = node;
        
        while(cur!=null){
            Node next = cur.next;
            cur.next = prv;
            prv = cur;
            cur = next;
        }
        return prv;
    }
}



// approach 2 tc : O(n+m) and sc : O(1)

// class GfG
// {
//     Node mergeResult(Node node1, Node node2){
//         Node n1 = reverse(node1);
//         Node n2 = reverse(node2);
        
//         Node temp = new Node(0);
//         Node res = temp;
        
//         while(true){
//             if(n1==null) {
//                 res.next=n2;
//                 break;
//             }
//             if(n2==null){
//                 res.next=n1;
//                 break;
//             }
//             if(n1.data>n2.data){
//                 res.next=n1;
//                 n1 = n1.next;
//             }
//             else{
//                 res.next=n2;
//                 n2=n2.next;
//             }
//             res = res.next;
            
//         }
//         return temp.next;
//     }
    
//     Node reverse(Node a){
//         Node prv = null,cur = a;
//         while(cur!=null){
//             Node temp = cur.next;
//             cur.next = prv;
//             prv = cur;
//             cur = temp;
//         }
//         return prv;
//     }
// }

