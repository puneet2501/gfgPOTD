class Solution {
    static int minCandy(int n, int rat[]) {
        // code here
        int arr[] = new int[n];
        arr[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            if(rat[i]>rat[i+1]) arr[i]=arr[i+1]+1;
            else arr[i] = 1;
        }
        
        for(int i=1; i<n; i++){
            if(rat[i]>rat[i-1] && arr[i]<=arr[i-1]) arr[i] = arr[i-1]+1;
        }
        int res = 0;
        for(int x : arr) res+=x;
        return res;
    }
}