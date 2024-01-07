class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int sum = 0,max=0;
        for(int x:arr){
            if(x>max) max =x;
            sum+=x;
        }
        
        while(max<=sum){
            int m = (max+sum)/2;
            int num = solve(arr,m);
            if(num>K) max = m+1;
            else sum = m-1;
        }
        return max;
    }
    
    static int solve(int arr[],int midSum){
        int count=1, sum=0;
        for(int i=0; i<arr.length; i++){
            if(sum+arr[i]<=midSum) sum += arr[i];
            else{
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
};
