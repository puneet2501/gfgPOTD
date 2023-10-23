class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    // Your code goes here
	    int dp[] = new int[n];
	    int res = arr[0];
	    for(int i=0; i<n; i++){
	        int max = 0;
	        for(int j=0; j<i; j++){
	            if(arr[i]>arr[j]) max = Math.max(max,dp[j]);
	        }
	        dp[i] = max+arr[i];
	        res = Math.max(dp[i],res);
	    }
	    return res;
	    
	}   
}