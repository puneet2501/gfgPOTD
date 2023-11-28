class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
        int count = 0;
        for(int i=0; i<V; i++) if(adj[i].size()%2==1) count++;
        if(count==0) return 2;
        return count==2?1:0;
    }
}