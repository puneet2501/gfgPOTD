// approach 1 using dfs(recursion)

/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/


class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node a, Node b)
	{
	    // Code Here
	    if(a==null && b==null) return true;
	    if(a==null || b==null) return false;
	    if(a.data!=b.data) return false;
	    return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
	}
}






-------------------------------------------------------
// approach 2 without recursion (bfs)



/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/


class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1.data!=root2.data) return false;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        
        q1.add(root1); q2.add(root2);
        
        while(true){
            
            Node a = q1.remove();
            Node b = q2.remove();
            
            if(a.data!=b.data) return false;
            
            if(a.left != null) q1.add(a.left);
            if(a.right!=null) q1.add(a.right);
            if(b.left!=null) q2.add(b.left);
            if(b.right!=null) q2.add(b.right);
            
            if(q1.size()==0 || q2.size()==0) break;
        }
        if(q1.size()!=q2.size()) return false;
        return true;
	}
}

