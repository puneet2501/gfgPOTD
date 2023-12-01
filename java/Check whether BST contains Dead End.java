
/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        solve(root,set,list);
        // for(int x: list) System.out.print(x+" ");
        
        for(int x : list){
            if(x==1 && set.contains(x+1)) return true;
            else if(set.contains(x-1) && set.contains(x+1)) return true;
        }
        return false;
    }
    
    static void solve(Node node, HashSet<Integer> set, List<Integer> list){
        if(node==null) return;
        if(node.left==null && node.right==null) list.add(node.data);
        solve(node.left,set,list);
        set.add(node.data);
        solve(node.right,set,list);
    }
}