//User function Template for Java

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    int i = 0;
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> list = new ArrayList<>();
       getNodes(root,list);
       Collections.sort(list);
       inorder(root,list);
       return root;
       
    }
    
    void getNodes(Node root, ArrayList<Integer> list){
        if(root==null) return;
        list.add(root.data);
        getNodes(root.left,list);
        getNodes(root.right,list);
    }
    
    void inorder(Node root, ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        root.data = list.get(i++);
        inorder(root.right,list);
    }
}
 