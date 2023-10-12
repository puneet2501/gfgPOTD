class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int dupSub(Node root) {
        // code here 
        HashMap<String,Integer> hm = new HashMap<>();
        solve(root.left,hm);
        solve(root.right,hm);
        
        for(Map.Entry<String,Integer> e : hm.entrySet()) if(e.getValue()>1) return 1;
        return 0;
    }
    
    String solve(Node node, HashMap<String,Integer> hm){
        StringBuilder sb = new StringBuilder();
        if(node==null) return "n";
        if(node.right==null && node.left==null) return node.data+",";
        
        sb.append(solve(node.left,hm));
        sb.append(solve(node.right,hm));
        sb.append(node.data+",");
        String s = sb.toString();
        hm.put(s,hm.getOrDefault(s,0)+1);
        return s;
    }
}