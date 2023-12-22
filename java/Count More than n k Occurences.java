class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> hm = new HashMap<>();
        k = n/k;
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
            if(hm.get(x)>k) set.add(x);
        }
        return set.size();
    }
}

