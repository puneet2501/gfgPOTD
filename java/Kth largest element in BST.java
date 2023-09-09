class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int count = 0;
    int ans = 0;
    public int kthLargest(Node root,int K)
    {
        //Your code here
        revInorder(root,K);
        return ans;
    }
    
    void revInorder(Node root, int k){
        if(root==null) return;
        revInorder(root.right,k);
        count++;
        if(count==k) {
            ans = root.data;
            return;
        }
        revInorder(root.left,k);
    }
}