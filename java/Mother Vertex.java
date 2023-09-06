class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int arr[] = new int[V];
        int lastNode = 0;
        
        for(int i=0; i<V; i++){
            if(arr[i]==0){
                dfs(adj,i,arr);
                lastNode = i;
            }
        }
        Arrays.fill(arr,0);
        dfs(adj,lastNode,arr);
        for(int x : arr){
            if(x==0) return -1;
        }
        return lastNode;
    }
    
    void dfs(ArrayList<ArrayList<Integer>> adj, int k, int[] arr){
        arr[k] = 1;
        for(int x : adj.get(k)){
            if(arr[x]==0){
                dfs(adj,x,arr);
            }
        }
    }
}