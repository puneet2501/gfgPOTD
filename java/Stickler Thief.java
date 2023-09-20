class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int pre = arr[0];
        int pop = 0;
        int max = pre;
        
        for(int i=1; i<n; i++){
            max = Math.max(pre,pop+arr[i]);
            pop = pre;
            pre = max;
        }
        
        return max;
    }
}