class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root==null) root = new Node(Key);
        if(root.data>Key) root.left = insert(root.left,Key);
        if(root.data<Key) root.right = insert(root.right,Key);
        
        return root;
    }
}