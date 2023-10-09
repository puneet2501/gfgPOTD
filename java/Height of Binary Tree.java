class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null) return 0;
        int x = height(node.left)+1;
        int y = height(node.right)+1;
        
        return x>y?x:y;
    }
}
