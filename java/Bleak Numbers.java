class Solution
{
    public int is_bleak(int n)
    {
        // Code here
        int m = n;
        int x = 0;
        while(n>0){
            n=n/2;
            x++;
        }
        
        for(int i=m-1; i>=m-x; i--){
            if(i+countSetBits(i)==m) return 0;
        }
        
        return 1;
    }
    int countSetBits(int x){
        int ans = 0;
        while(x>0){
            if((x&1)==1) ans++;
            x=x>>1;
        }
        return ans;
    }
}