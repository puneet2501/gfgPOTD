class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        if(n-m!=1) return false;
        ArrayList<Integer>[] adj = new ArrayList[n];
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++) adj[i] = new ArrayList<>();
        
        for(int i=0; i<m; i++){
            adj[edges.get(i).get(0)].add(edges.get(i).get(1));
            adj[edges.get(i).get(1)].add(edges.get(i).get(0));
        }
        
        dfs(0,adj,arr);
        
        for(int k : arr) if(k==0) return false;
        
        return true;
        
    }
    
    void dfs(int n, ArrayList<Integer>[] adj, int arr[]){
        arr[n] = 1;
        for(int x : adj[n]) if(arr[x]==0) dfs(x,adj,arr);
    }
}