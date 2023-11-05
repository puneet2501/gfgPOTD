class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        int arr[] = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(hm.get(a)==hm.get(b)) return b-a;
            return hm.get(b)-hm.get(a);
            
        });
        
        for(int key : hm.keySet()){
            pq.add(key);
        }
        
        for(int i=0; i<k; i++){
            arr[i] = pq.remove();
        }
        
        return arr;
    }
}