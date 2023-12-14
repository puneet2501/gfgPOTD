class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int mod = 1000000007;
        int a = 1, b=2;
        if(n<3) return n;
        for(int i=3; i<=n; i++){
            int temp = a;
            a = b%mod;
            b = (temp+b)%mod;
        }
        return b;
        
    }
    
    
}