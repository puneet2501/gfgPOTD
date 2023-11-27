// User function Template for Java
// Sum of dependencies in a graph

class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int res = 0;
        for(ArrayList<Integer> list : adj){
            res+=list.size();
        }
        return res;
    }
};