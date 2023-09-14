class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int dp[][] = new int[n+1][sum+1];
	    for(int i=0; i<=n; i++){
	        dp[i][0] = 1;
	    }
	    
	    for(int i=1; i<=n; i++){
	        for(int j=0; j<=sum; j++){
	            if(arr[i-1]<=j) dp[i][j] = (dp[i-1][j] + dp[i-1][j-arr[i-1]])%1000000007;
	            else dp[i][j] = dp[i-1][j];
	        }
	    }
	    
	    return dp[n][sum];
	} 
}