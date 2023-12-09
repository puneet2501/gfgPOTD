class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    // Subarray with 0 sum
    
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        
        return false;
    }
}