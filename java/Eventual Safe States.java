class Solution {

    List<Integer> eventualSafeNodes(int n, List<List<Integer>> adj) {

        // Your code here
        List<Integer> list = new ArrayList<>();
        int vis[] = new int[n];
        for(int i=0; i<n; i++){
            if(dfs(adj,i,vis)) list.add(i);
        }
        return list;
    }
    
    boolean dfs(List<List<Integer>> adj, int i, int[] vis){
        if(vis[i]==1) return false;
        if(vis[i]==2) return true;
        
        vis[i] = 1;
        for(int nbrs : adj.get(i)){
            int a = vis[nbrs];
            if(a==1) return false;
            if(a==2) continue;
            if(!dfs(adj,nbrs,vis)) return false;
        }
        vis[i] = 2;
        return true;
    }
}
