class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int arr[] = new int[k];
        for(int i=0; i<nums.length; i++) arr[nums[i]%k]++;
        
        if(arr[0]%2==1) return false;
        int i=1,j=k-1;
        
        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++; j--;
        }
        
        return true;
    }
}