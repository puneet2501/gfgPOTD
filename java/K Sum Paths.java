class Solution
{
    private int count = 0;
    public int sumK(Node root,int k)
    {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        totalPaths(root,hm,k,0);
        return count;
    }
    
    private void totalPaths(Node node, HashMap<Integer,Integer> hm, int k, int sum){
        if(node==null) return;
        sum += node.data;
        if(hm.containsKey(sum-k)) count+= hm.get(sum-k);
        // if(sum==k) count++;
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        totalPaths(node.left,hm,k,sum);
        totalPaths(node.right,hm,k,sum);
        hm.put(sum,hm.get(sum)-1);
    }
}