class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0, res = 0;
        int i=0, j=0;
        while(j!=K){
            sum+=Arr.get(j++);
        }
        res = sum;
        
        while(j!=N){
            
            sum = sum+Arr.get(j++);
            sum = sum-Arr.get(i++);
            
            res = Math.max(res,sum);
        }
        
        return res;
        
    }
}