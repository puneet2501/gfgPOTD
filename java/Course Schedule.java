class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> pq) 
    {
        // add your code here
        int res[] = new int[n];
        int ind[] = new int[n];
        int k = 0;
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        
        for(int i=0; i<m; i++){
            int a = pq.get(i).get(1);
            int b = pq.get(i).get(0);
            ind[b]++;
            
            hm.computeIfAbsent(a, y -> new ArrayList<>()).add(b);

        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) if(ind[i]==0) q.add(i);
        
        while (q.size() > 0) {
            res[k] = q.remove();
        
            if (hm.containsKey(res[k])) {
                Iterator<Integer> iterator = hm.get(res[k]).iterator();
                while (iterator.hasNext()) {
                    int x = iterator.next();
                    ind[x]--;
                    if (ind[x] == 0) {
                        q.add(x);
                        iterator.remove();  // Use iterator's remove method without arguments
                    }
                }
            }
        k++;
    }
        
        
        return k==n?res:new int[0];
    }
}
