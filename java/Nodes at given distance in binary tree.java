class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> list = new ArrayList<>();
        findKDN(root,target,k,list);
        Collections.sort(list);
        return list;
        
    }
    
    static void findKDNdown(Node node, int k, ArrayList<Integer> list){
        if(node==null || k<0) return;
        if(k==0){
            list.add(node.data);
            return;
        }
        
        findKDNdown(node.left,k-1,list);
        findKDNdown(node.right,k-1,list);
    }
    
    static int findKDN(Node node, int target, int k, ArrayList<Integer> list){
        if(node==null) return -1;
        if(node.data==target){
            findKDNdown(node,k,list);
            return 0;
        }
        
        int ld = findKDN(node.left,target,k,list);
        if(ld!=-1){
            if(ld+1==k) list.add(node.data);
            else findKDNdown(node.right,k-ld-2,list);
            return ld+1;
        }
        
        int rd = findKDN(node.right,target,k,list);
        if(rd!=-1){
            if(rd+1==k) list.add(node.data);
            else findKDNdown(node.left,k-rd-2,list);
            return rd+1;
        }
        return -1;
    }
    
    
};
