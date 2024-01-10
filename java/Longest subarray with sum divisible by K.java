class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int len = 0,max = 0,sum=0;
        
        for(int i=0; i<n; i++){
            sum = (sum + a[i])%k;
            if(sum<0) sum = k+sum;
            
            if(hm.containsKey(sum%k)){
                len = i-hm.get(sum%k);
            }
            else hm.put(sum%k,i);
            if(len>max) max = len;
        }
        
        return max;
    }
 
}