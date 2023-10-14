/*class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class GfG
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        ArrayList<Node> list = new ArrayList<>();
        inorder(root,list);
        return bbst(list,0,list.size()-1);
        
        
    }
    void inorder(Node root, ArrayList<Node> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
    
    Node bbst(ArrayList<Node> list, int l, int r){
        if(l>r) return null;
        
        int mid = (l+r)/2;
        
        Node root = list.get(mid);
        root.left = bbst(list,l,mid-1);
        root.right = bbst(list,mid+1,r);
        
        return root;
    }
}

