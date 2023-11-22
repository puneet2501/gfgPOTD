//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    int height;
};
*/
class Solution
{
    public  Node insertToAVL(Node node,int data)
    {
        //code here
        if(node==null) return new Node(data);
        if(data<node.data) node.left = insertToAVL(node.left,data);
        else node.right = insertToAVL(node.right,data);
        
        node.height = Math.max(height(node.left),height(node.right))+1;
        int diff = height(node.left)-height(node.right);
        
        if(diff>1){
            if(data<node.left.data) return rightRotation(node);
            else{
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }
        }
        if(diff<-1){
            if(data>node.right.data) return leftRotation(node);
            else{
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
        }
        
        return node;
    }
    
    private int height(Node node){
        if(node==null) return 0;
        return node.height;
    }
    
    private Node leftRotation(Node node){
        Node r = node.right;
        Node rl = r.left;
        r.left = node;
        node.right = rl;
        
        node.height = Math.max(height(node.left),height(node.right))+1;
        r.height = Math.max(height(r.left),height(r.right))+1;
        
        return r;
    }
    
    private Node rightRotation(Node node){
        Node l = node.left;
        Node lr = l.right;
        l.right = node;
        node.left = lr;
        
        node.height = Math.max(height(node.left),height(node.right))+1;
        l.height = Math.max(height(l.left),height(l.right))+1;
        
        return l;
    }
}    

