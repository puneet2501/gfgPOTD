class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long sum=0,max=0,prv=0;
        int i=0,j=0;

        while (i < k) sum += a[i++];

        max = sum;

        while (i < n) {
            sum = sum + a[i++];
            prv = prv + a[j++];
            max = Math.max(sum,max);
            if(prv<0){
                sum = sum-prv;
                prv = 0;
                max = Math.max(sum,max);
            }
        }

        return max;
    }
}