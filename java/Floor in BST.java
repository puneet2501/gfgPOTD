class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int res = -1;
        
        while(root!=null){
            if(root.data==x) return x;
            if(root.data>x) root = root.left;
            else{
                res = root.data;
                root = root.right;
            }
        }
        return res;
    }
}