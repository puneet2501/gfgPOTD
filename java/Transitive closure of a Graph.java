class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> vis = new ArrayList<Integer>(Collections.nCopies(N,0));
            dfs(i,graph,vis,N);
            list.add(vis);
        }
        return list;
    }
    
    static void dfs(int i, int[][] graph, ArrayList<Integer> vis, int N){
        vis.set(i,1);
        for(int j=0; j<N; j++){
            if(graph[i][j]==1 && vis.get(j)==0) dfs(j,graph,vis,N);
        }
    }
}