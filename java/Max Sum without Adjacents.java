class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        if(n==1) return arr[0];
        
        int i=2;
        int res = 0;
        
        while(i<n){
            arr[i] = arr[i]+arr[i-2];
            arr[i-1] = Math.max(arr[i-1],arr[i-2]);
            res = Math.max(arr[i],arr[i-1]);
            i++;
        }
        
        return res;
    }
}