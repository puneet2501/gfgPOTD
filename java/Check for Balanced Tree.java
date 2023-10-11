/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(check(root)>0) return true;
	    return false;
    }
    int check(Node root){
        if(root==null) return 0;
        int l = check(root.left);
        if(l==-1) return -1;
        int r = check(root.right);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }
}

