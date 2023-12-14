class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        long mod = 1000000007;
        long same = 0, diff = k, total = same+diff;
        
        for(int i=2; i<=n; i++){
            same = diff;
            diff = (total*(k-1))%mod;
            total = (same+diff)%mod;
            
        }
        return total;
        
    }
}