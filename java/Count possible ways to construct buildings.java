class Solution
{
    public int TotalWays(int N)
    {
        // Code here
        int mod = 1000000007;
        long a=1,b=2,c=2;
        for(int i=2; i<=N;i++){
            c=(a+b)%mod;a=b;b=c;
        }
        c = (c*c)%mod;
        return (int)c;
    }
}