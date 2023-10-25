class Solution{
    static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        int arr[][] = new int[n][w+1];
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=w; j++){
                
                int pick = 0;
                int np = 0;
                
                if(wt[i]<=j) pick = val[i] + arr[i][j-wt[i]];
                if(i>0) np = arr[i-1][j];
                
                arr[i][j] = Math.max(pick,np);
            }
        }
        
        return arr[n-1][w];
    }
}