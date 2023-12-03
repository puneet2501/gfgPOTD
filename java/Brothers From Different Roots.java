/*Structure of the Node of the BST is as
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
*/

class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		HashSet<Integer> set = new HashSet<>();
		int arr[] = {0};
		inorder(root1,set,x,arr,true);
		inorder(root2,set,x,arr,false);
		
		return arr[0];
	}
	
	private static void inorder(Node node, HashSet<Integer> set, int x, int arr[], boolean flag){
	    if(node==null) return ;
	    
	    if(flag==true){
	        inorder(node.left,set,x,arr,true);
	        if(node.data<x) set.add(node.data);
	        inorder(node.right,set,x,arr,true);
	    }
	    else{
	        inorder(node.left,set,x,arr,false);
	        if(set.contains(x-node.data)) arr[0]++;
	        inorder(node.right,set,x,arr,false);
	    }
	}
}
