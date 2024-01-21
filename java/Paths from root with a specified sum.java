
//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        solve(root,sum,list,res,0);
        return res;
    }
    
    static void solve(Node root, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, int t){
        if(root==null) return;
        list.add(root.data);
        t = t + root.data;
        
        if(t==sum) res.add(new ArrayList<>(list));
        solve(root.left,sum,list,res,t);
        solve(root.right,sum,list,res,t);
        
        list.remove(list.size()-1);
        
    }
}

