class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        long a=1,b=2,c=4,ans=0;
        
        for(int i=4;i<=n; i++){
            ans = (a+b+c)%1000000007;
            a=b;
            b=c;
            c=ans;
        }
        
        return ans;
    }
    
}
