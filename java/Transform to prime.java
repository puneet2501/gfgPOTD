class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int x: arr) sum+=x;
        int ts = sum;
        
        if(sum==1) return 1;
        while(true){
            if(isPrime(sum)) break;
            sum++;
        }
        return sum-ts;
        
    }
    
    private boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}