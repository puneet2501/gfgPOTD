class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int x : arr) sum+=x;
        if(sum%2==1) return 0;
        sum = sum/2;
        int x[][] = new int[N+1][sum+1];
        for(int i=0; i<=N; i++) x[i][0] = 1;
        for(int i=1; i<=N; i++){
            for(int j=0; j<=sum; j++){
                if(arr[i-1]<=j) x[i][j] = x[i-1][j]+x[i-1][j-arr[i-1]];
                else x[i][j] = x[i-1][j];
            }
        }
        return x[N][sum]==0?0:1;
    }
}